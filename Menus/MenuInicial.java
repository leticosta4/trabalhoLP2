package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuInicial extends JFrame{
    private JButton funcionarioButton;
    private JButton clienteButton;
    public JPanel PainelInicial;
    private JButton sairButton;
    private JLabel titulo;


    public MenuInicial(){
        iniciarComponentes();
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(funcionarioButton, "Indo para a tela de login");
                MenuLogin menuLogin = new MenuLogin();
                dispose();
            }

        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void iniciarComponentes(){

        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36)));
        this.setVisible(true);
        this.setContentPane(this.PainelInicial);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        funcionarioButton.setLocation(300,200);
    }

}






