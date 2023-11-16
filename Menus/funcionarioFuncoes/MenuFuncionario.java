package Menus.funcionarioFuncoes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame {
    private JPanel painelFuncionario;
    private JButton listarProdutosButton;
    private JButton atualizarProdutosButton;
    private JButton adicionarOuRemoverProdutosButton;
    private JButton sairButton;


    public  MenuFuncionario(){

        adicionarComponentes();
        listarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               MenuListarProdutos listarProdutos = new MenuListarProdutos();

            }
        });
        listarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(listarProdutosButton, "Indo para o estoque");
//                ListarProdutos listarProdutos = new ListarProdutos();
                dispose();
            }
        });
    }

    private void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.painelFuncionario);
        this.setSize(800,640);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}


