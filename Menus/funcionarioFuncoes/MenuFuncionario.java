package Menus.funcionarioFuncoes;

import Itens.Loja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame {
    private JPanel painelFuncionario;
    private JButton listarProdutosButton;
    private JButton atualizarProdutosButton;
    private JButton adicionarOuRemoverButton;
    private JButton sairButton;


    public  MenuFuncionario(Loja loja){
        adicionarComponentes();
        listarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(listarProdutosButton, "Indo para o estoque");
                MenuListarProdutos listarProdutos = new MenuListarProdutos(loja);
                dispose();
            }
        });
    }

    private void adicionarComponentes(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.painelFuncionario);
        this.setSize(350,277);
        this.setVisible(true);
    }
}


