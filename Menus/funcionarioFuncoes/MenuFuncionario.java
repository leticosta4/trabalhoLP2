package Menus.funcionarioFuncoes;

import Itens.Loja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFuncionario extends JFrame implements ActionListener{
    private JPanel painelFuncionario;
    private JButton listarProdutosButton;
    private JButton atualizarProdutosButton;
    private JButton adicionarOuRemoverButton;
    private JButton sairButton;

    private Loja loja;

    public  MenuFuncionario(Loja loja){
        this.loja = loja;
        adicionarComponentes();

//        teste(loja);
    }

    private void adicionarComponentes(){
        this.setLocationRelativeTo(null);
        this.setContentPane(this.painelFuncionario);
        this.setSize(350,277);
        this.setVisible(true);
        botoes();
        this.pack();
    }
    private void botoes(){
        listarProdutosButton.addActionListener(this);
        atualizarProdutosButton.addActionListener(this);
        adicionarOuRemoverButton.addActionListener(this);
        sairButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == listarProdutosButton){
            JOptionPane.showMessageDialog(listarProdutosButton, "Indo para o estoque");
            MenuListarProdutos listarProdutos = new MenuListarProdutos(this.loja);
        }else if(e.getSource() == atualizarProdutosButton){
            System.out.println("em produção");
        } else if(e.getSource() == adicionarOuRemoverButton) {
            MenuAdicionarProdutos menuAdicionarProdutos = new MenuAdicionarProdutos(this.loja);
        } else if(e.getSource() == sairButton){
            dispose();
        }
    }
//    private void teste(Loja loja){
//        loja.MostrarProdutos();
//    }
}


