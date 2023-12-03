package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame implements ListSelectionListener, ActionListener, MouseListener {

    private String produtoAExcluir = "";
    private JPanel PainelP;
    private JComboBox<String> comboBox1;
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
    private Loja loja;
    public MenuListarProdutos(Loja loja){
        this.loja = loja;
        adicionarComponentes();
        listarProdutos(loja);
    }

    public void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.PainelP);
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        botoes();
    }
    private void botoes() {
        listProds.addListSelectionListener(this);
        voltarButton.addActionListener(this);
        pesquisaTextField.addActionListener(this);
        listProds.addMouseListener(this);
        removerButton.addActionListener(this);

    }
    private void listarProdutos(Loja loja) {
        DefaultListModel<String> dlmS = new DefaultListModel<>();
        ArrayList<Produtos> prod = loja.getListaProdutos();

        String textoEscolhido = pesquisaTextField.getText().toLowerCase();
        for (Produtos produtos : prod) {
            if (produtos.getNome().toLowerCase().contains(textoEscolhido)) {
                this.dlm.addElement(produtos);
                dlmS.addElement(produtos.getNome());
            }
            this.listProds.setModel(dlmS);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == voltarButton){
            dispose();
        }
        else if (e.getSource() == pesquisaTextField){
            listarProdutos(loja);
        }
        else if(e.getSource() == comboBox1){
            String item = (String) comboBox1.getSelectedItem();
            if(item  != null){
                switch (item){
                    case "Remédios" -> {


                    }
                    case "Cosméticos" -> {
//oov

                    }
                    case "Higiénicos" -> {
//oov
                    }
                }
            }
        } else if (e.getSource() == removerButton) {
            loja.RemoverProduto(this.produtoAExcluir);
            this.produtoAExcluir = "";

        }
        listarProdutos(loja);
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.infoPane.setText("<html>" + dlm.get(listProds.getSelectedIndex()).toString() + "</html>");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) { // Verifica se foi um clique simples
            int index = listProds.locationToIndex(e.getPoint()); // Obtém o índice do item clicado
            if (index != -1) { // Verifica se um item foi clicado

               this.produtoAExcluir = listProds.getModel().getElementAt(index);
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



