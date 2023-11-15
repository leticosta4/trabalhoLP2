package Menus.funcionarioFuncoes;

import Menus.MenuInicial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame {
    private JPanel painelFuncionario;
    private JButton listarProdutosButton;
    private JButton atualizarProdutosButton;
    private JButton adicionarOuRemoverProdutosButton;


    public  MenuFuncionario(){

        adicionarComponentes();
        listarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               MenuListarProdutos listarProdutos = new MenuListarProdutos();

            }
        });
    }

    private void adicionarComponentes(){
        this.setContentPane(this.painelFuncionario);
        this.setSize(800,640);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}


