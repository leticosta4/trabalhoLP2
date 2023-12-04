package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;
import Usuarios.Cliente;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame implements ListSelectionListener, ActionListener, MouseListener {

    private String produtoASelecionado = "";
    private JPanel PainelP;
    private JComboBox<String> tiposProdutosBox;
    private JScrollPane scrollpane1;
    private JScrollPane scrollpane2;
    private JLabel infoPane;
    private JTextField pesquisaTextField;
    private JList<String> listProds;
    private JLabel pesquisaLabel;
    private DefaultListModel<Produtos> dlm = new DefaultListModel<>();
    private JButton voltarButton;
    private JButton removerButton;
    private JButton modificarButton;
    private JButton verCarrinhoButton;
    private JButton adicionarCompraButton;
    private JButton finalizarCompraButton;
    private Loja loja;
    private Cliente cliente;
    private int especificarLista = 0; // Para decidir se vai listar os produtos da loja ou o carrinho do cliente
    private String nomeApesquisar = "";
    public MenuListarProdutos(Loja loja, Cliente cliente){
        this.loja = loja;
        this.cliente = cliente;
        adicionarComponentes();
        listarProdutos(especificarLista);
    }

    public void adicionarComponentes() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.PainelP);
        this.setVisible(true);
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        botoes();
        if (cliente != null) ativarModoCliente();
    }
    private void botoes() {
        this.listProds.addListSelectionListener(this);
        this.voltarButton.addActionListener(this);
        this.pesquisaTextField.addActionListener(this);
        this.listProds.addMouseListener(this);
        this.removerButton.addActionListener(this);
        this.modificarButton.addActionListener(this);
        this.tiposProdutosBox.addActionListener(this);
        this.adicionarCompraButton.addActionListener(this);
        this.verCarrinhoButton.addActionListener(this);
        this.finalizarCompraButton.addActionListener(this);
    }

    private void ativarModoCliente(){
        modificarButton.setText("Ver loja");
        this.verCarrinhoButton.setVisible(true);
        removerButton.setText("Remover do Carrinho");
        adicionarCompraButton.setVisible(true);
        finalizarCompraButton.setVisible(true);
    }
    private void listarProdutos(int qualLista) {
        DefaultListModel<String> dlmS = new DefaultListModel<>();

        ArrayList<Produtos> prod = qualLista == 0 ? this.loja.getListaProdutos() : this.cliente.getCarrinhoCompras();
        this.dlm.clear();
        String textoEscolhido = pesquisaTextField.getText().toLowerCase();

        for (Produtos produtos : prod) {
            System.out.println(produtos.getClass().getName());
            if (produtos.getNome().toLowerCase().contains(textoEscolhido) && produtos.getClass().getName().contains(this.nomeApesquisar) ) {
                this.dlm.addElement(produtos);
                dlmS.addElement(produtos.getNome());
            }

        }
        this.listProds.setModel(dlmS);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == voltarButton){
            dispose();
        }
        else if (e.getSource() == pesquisaTextField){
            listarProdutos(especificarLista);
        }
        else if(e.getSource() == tiposProdutosBox){
            String item = (String) tiposProdutosBox.getSelectedItem();
            if(item  != null){
                switch (item){
                    case "Remédios" -> {
                        this.nomeApesquisar = "Remedios";
                        listarProdutos(especificarLista);
                    }
                    case "Cosméticos" -> {
                        this.nomeApesquisar = "Cosmeticos";
                       listarProdutos(especificarLista);
                    }
                    case "Higiênicos" -> {
                        this.nomeApesquisar = "Higienicos";
                        listarProdutos(especificarLista);
                    }
                    case "Todos" ->{
                        this.nomeApesquisar = "";
                        listarProdutos(especificarLista);
                    }
                }
            }
        } else if (e.getSource() == removerButton) { //Quando o cliente é diferente de null, o remover vira remover do Carrinho;
            if (cliente != null) cliente.excluirDoCarrinho(this.produtoASelecionado);

             else loja.RemoverProduto(this.produtoASelecionado);

            this.produtoASelecionado = "";
            listarProdutos(especificarLista);

        } else if (e.getSource() == modificarButton) {
            if(cliente != null)
                especificarLista = 0; //Nesse caso o modificarButton vira a opção para ver a loja
            listarProdutos(especificarLista);
        }
        else if(e.getSource() == verCarrinhoButton){
            especificarLista = 1;
            listarProdutos(especificarLista);
        } else if (e.getSource() == finalizarCompraButton) {
            JOptionPane.showMessageDialog(finalizarCompraButton,"Compra Finalizada com Sucesso");
            this.cliente.finalizarCompra();
        }
        else if(e.getSource() == adicionarCompraButton){
            Produtos produtoAdicionar = null;
            for (Produtos produtos : loja.getListaProdutos()){
                if(produtoASelecionado.equalsIgnoreCase(produtos.getNome())) {
                    produtoAdicionar = produtos;
                }
            }
            cliente.adicionarNoCarrinho(produtoAdicionar);
        }
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting() && listProds.getSelectedIndex() != -1) {
            Produtos produtoSelecionado = dlm.getElementAt(listProds.getSelectedIndex());
            if (produtoSelecionado != null) {
                this.infoPane.setText("<html>" + produtoSelecionado + "</html>");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) { //
            int i = listProds.locationToIndex(e.getPoint()); // Obtém o índice do item clicado
            if (i != -1) { // Verifica se um item foi clicado
                this.produtoASelecionado = listProds.getModel().getElementAt(i);

                // Faça o que for necessário com o texto do item clicado
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}