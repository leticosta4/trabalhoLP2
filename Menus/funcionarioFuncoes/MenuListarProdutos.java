package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame{

    private JPanel PainelListar;
    private JTextField textField1;
    private JList listProds;
    private JScrollPane Scrollpane1;
    private JScrollPane Scrollpane2;
    private JLabel pesquisaText;
    private JLabel infoPanel;

    public MenuListarProdutos(Loja loja){
        adicionarComponentes();
        listarProdutos(loja, listProds);
    }

    public void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.PainelListar);
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    private void listarProdutos(Loja loja, JList jlist){
        DefaultListModel dlm = new DefaultListModel<>();
        ArrayList<Produtos> prod = loja.getListaProdutos();
        for(Produtos produtos:prod){
            dlm.addElement(produtos);
        }
        jlist.setModel(dlm);
    }
}


