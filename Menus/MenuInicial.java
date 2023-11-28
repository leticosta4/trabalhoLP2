package Menus;

import Itens.*;

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
    Loja let = new Loja();
    Produtos remedio01 = new Remedios("Tylenol", 50.0, 2, "Leticia", "branca");
    Produtos comestico01 = new Cosmeticos("Esmalte", 50.0, 2, "Leticia", true, "azul");
    Produtos higienico01 = new Higienicos("Papel", 15, 2, "bauduco", 3);
    Produtos comestico02 = new Cosmeticos("Teste1", 50.0, 2, "Leticia", true, "azul");
    Produtos comestico03 = new Cosmeticos("Esmalte2", 50.0, 2, "Leticia", true, "azul");

    public MenuInicial(){
        this.let.AdicionarProduto(remedio01);
        this.let.AdicionarProduto(comestico01);
        this.let.AdicionarProduto(higienico01);
        this.let.AdicionarProduto(comestico02);
        this.let.AdicionarProduto(comestico03);

        iniciarComponentes();
    }

    //autoExplicativo
    private void iniciarComponentes(){
        //configs da janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36))); //da p tirar
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
        //passando a loja como parametro p os 2 tipos
        if(e.getSource() == clienteButton){
            JOptionPane.showMessageDialog(clienteButton, "Indo para menu do cliente");
            MenuCliente menuCliente = new MenuCliente(let);
            this.setVisible(false);
        } else if (e.getSource() == funcionarioButton) {
            JOptionPane.showMessageDialog(funcionarioButton, "Indo para login do funcionário");
            MenuLogin menuLogin = new MenuLogin(let);
        } else if (e.getSource() == sairButton) {
            dispose();
        }
    }
}






