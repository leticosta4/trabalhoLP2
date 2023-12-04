package Menus;

import Itens.Loja;
import Menus.MenuAdicionarProdutos;
import Menus.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame implements ActionListener{
    private JPanel painelFuncionario;
    private JButton listarProdutosButton;
    private JButton sairButton;
    private JButton adicionarButton;

    private Loja loja;

    public  MenuFuncionario(Loja loja){
        this.loja = loja;
        adicionarComponentes();


    }

    private void adicionarComponentes(){
        this.setLocationRelativeTo(null);
        this.setContentPane(this.painelFuncionario);
        this.setSize(350,277);
        this.setVisible(true);
        setLocationRelativeTo(null);
        botoes();
        this.pack();
    }
    private void botoes(){
        this.listarProdutosButton.addActionListener(this);
        this.adicionarButton.addActionListener(this);
        this.sairButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == listarProdutosButton){
            JOptionPane.showMessageDialog(listarProdutosButton, "Indo para o estoque");
            MenuListarProdutos listarProdutos = new MenuListarProdutos(this.loja, null);
        } else if(e.getSource() == adicionarButton) {
            MenuAdicionarProdutos menuAdicionarProdutos = new MenuAdicionarProdutos(this.loja);

        } else if(e.getSource() == sairButton){
            dispose();
        }
    }
}


