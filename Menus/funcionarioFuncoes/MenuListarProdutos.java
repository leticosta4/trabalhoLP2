package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame{

    private JPanel Painel;
    private JTextField textField1;
    private JScrollPane painelInfo;
    private JScrollPane painelLista;
    private JList list1;
    private JComboBox comboBox1;
    private JLabel infoLabel;
    private JLabel caixaPesquisa;
    private JList listProds;

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

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}


