package Menus;

import Itens.Loja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCliente extends JFrame implements ActionListener{
    private JPanel MenuCliente;
    private JButton LojaButton;
    private JButton sairButton;
    private JButton carrinhoButton;
    private JLabel mensagem;
    public MenuCliente(Loja loja) {
        adicionarComponentes();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sairButton){
            dispose();
        }
    }

    private void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension ideal = new Dimension(800, 300);
        this.setContentPane(this.MenuCliente);
        this.setVisible(true);
        this.setMinimumSize(ideal);
        this.setSize(ideal);
        this.setLocationRelativeTo(null); //p n passar do limite
        alteracaoFontes();
        botoes();
    }

    private void botoes(){
        LojaButton.addActionListener(this);
        carrinhoButton.addActionListener(this);
        sairButton.addActionListener(this);
    }
    private void alteracaoFontes(){ //da p mexer pela interface
        mensagem.setFont(new Font("Serif", Font.BOLD,36));
//        .setFont(new Font("Arial", Font.BOLD,26));
    }
}
