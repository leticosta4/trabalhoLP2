package Menus;

import Itens.Loja;

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

    public MenuInicial(Loja loja){
        iniciarComponentes();
        clienteButton.addActionListener(this);
        funcionarioButton.addActionListener(this);
        sairButton.addActionListener(this);

    }

    private void iniciarComponentes(){

        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36)));
        this.setVisible(true);
        this.setContentPane(this.PainelInicial);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        funcionarioButton.setLocation(300,200);
        alterarFonte();
    }

    public void alterarFonte(){
        this.titulo.setFont((new Font("Arial", Font.ITALIC, 36)));
        this.conglomeradoLet.setFont((new Font("Arial",Font.ITALIC + Font.BOLD,15)));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clienteButton){
            JOptionPane.showMessageDialog(funcionarioButton, "Indo para menu do Cliente");
            MenuCliente menuCliente = new MenuCliente(let);
        } else if (e.getSource() == funcionarioButton) {
            MenuLogin menuLogin = new MenuLogin(let);
        } else if (e.getSource() == sairButton) {
            dispose();
        }

    }


}






