package Menus.funcionarioFuncoes;

import javax.swing.*;

public class MenuListarProdutos extends JFrame {
    private JPanel painelListaProdutos;
    private JScrollPane Scroll;


    public MenuListarProdutos(){
        adicionarComponentes();
    }

    public void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.painelListaProdutos);
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
    }
}


