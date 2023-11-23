package Menus;

import Itens.Loja;
import Itens.Produtos;
import Itens.Remedios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuInicial extends JFrame implements ActionListener{
    private JButton funcionarioButton;
    private JButton clienteButton;
    public JPanel PainelInicial;
    private JButton sairButton;
    private JLabel titulo;
    private JLabel conglomeradoLet;
    private final Loja loja;
    public MenuInicial(Loja loja){
        this.loja = loja;
        iniciarComponentes();
//        teste(loja);
    }

    //autoExplicativo
    private void iniciarComponentes(){
        //configs da janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36)));
        this.setVisible(true);
        this.setContentPane(this.PainelInicial);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);

        alterarFonte();
        botoes();
    }

    private void botoes(){
        funcionarioButton.setLocation(300,200);
        clienteButton.addActionListener(this);
        funcionarioButton.addActionListener(this);
        sairButton.addActionListener(this);
    }
    private void alterarFonte(){
        this.titulo.setFont((new Font("Arial", Font.ITALIC, 36)));
        this.conglomeradoLet.setFont((new Font("Arial",Font.ITALIC + Font.BOLD,15)));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clienteButton){
            JOptionPane.showMessageDialog(clienteButton, "Indo para menu do Cliente");
            MenuCliente menuCliente = new MenuCliente(loja);
            this.setVisible(false);
        } else if (e.getSource() == funcionarioButton) {
            JOptionPane.showMessageDialog(funcionarioButton, "Indo para login do funcionário");
            MenuLogin menuLogin = new MenuLogin(loja);
        } else if (e.getSource() == sairButton) {
            dispose();
        }
    }
//    private void teste(Loja loja){
//        loja.MostrarProdutos();
//    }

}






