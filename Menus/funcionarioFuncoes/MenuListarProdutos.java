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
    private JComboBox<String> comboBox1; //caixinha de seleçao de tipo de produto
    private JScrollPane scrollpane1;
    private JScrollPane scrollpane2;
    private JLabel infoPane;
    private JTextField pesquisaTextField;
    private JList<String> listProds;
    private JLabel pesquisaLabel;
    private DefaultListModel<Produtos> dlm = new DefaultListModel<>(); //manipulaçao de elementos da lista
    private JButton voltarButton;
    private JButton removerButton;
    private JButton modificarButton;
    private Loja loja;
    private String nomeApesquisar = "";
    public MenuListarProdutos(Loja loja){
        this.loja = loja;
        adicionarComponentes();
        listarProdutos();
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
        this.listProds.addListSelectionListener(this);
        this.voltarButton.addActionListener(this);
        this.pesquisaTextField.addActionListener(this);
        this.listProds.addMouseListener(this);
        this.removerButton.addActionListener(this);
        this.modificarButton.addActionListener(this);
        this.comboBox1.addActionListener(this);

    }
    private void listarProdutos() {
        //dlm e p usar o JList
        DefaultListModel<String> dlmS = new DefaultListModel<>(); //dlm especificado p string
        ArrayList<Produtos> prod = this.loja.getListaProdutos();
        this.dlm.clear(); //dlm geral para os produtos
        //na hora de mostrar a lista tem que apagar tudo p depois recriar
        String textoEscolhido = pesquisaTextField.getText().toLowerCase();

        for (Produtos produtos : prod) {
            System.out.println(produtos.getClass().getName());
            if (produtos.getNome().toLowerCase().contains(textoEscolhido) && produtos.getClass().getName().contains(this.nomeApesquisar)){
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
            listarProdutos();
        }
        else if(e.getSource() == comboBox1){
            String item = (String) comboBox1.getSelectedItem();
            if(item  != null){
                switch (item){
                    case "Remédios" -> {
                        this.nomeApesquisar = "Remedios";
                        listarProdutos();
                    }
                    case "Cosméticos" -> {
                        this.nomeApesquisar = "Cosmeticos";
                       listarProdutos();
                    }
                    case "Higiênicos" -> {
                        this.nomeApesquisar = "Higienicos";
                        listarProdutos();
                    }
                    case "Todos" ->{
                        this.nomeApesquisar = "";
                        listarProdutos();
                    }
                }
            }
        } else if (e.getSource() == removerButton) {
            loja.RemoverProduto(this.produtoAExcluir);
            this.produtoAExcluir = "";
            listarProdutos();

        } else if (e.getSource() == modificarButton) {
            //fazer o modoficar dados de produtos
        }

    }
    @Override
    public void valueChanged(ListSelectionEvent e) { //seleçao na lista alterada
        //produto nao selecionado index e -1. taratamento de erro para "ignorar" esse -1:
        if (!e.getValueIsAdjusting() && (listProds.getSelectedIndex() != -1)) {
            Produtos selectedObject = dlm.getElementAt(listProds.getSelectedIndex());
            if (selectedObject != null) {
                this.infoPane.setText("<html>" + selectedObject + "</html>");
            }
        }
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