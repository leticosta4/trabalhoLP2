package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicial extends JFrame {
    private JButton funcionarioButton;
    private JButton clienteButton;
    public JPanel PainelInicial;
    private JButton sairButton;
    private JLabel titulo;

    public MenuInicial() {
        iniciarComponentes();
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(funcionarioButton, "Indo para a tela de login");
                MenuLogin menuLogin = new MenuLogin();
                dispose();
            }

        });
        clienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(funcionarioButton, "Indo para menu do Cliente");
                MenuCliente menuCliente = new MenuCliente();
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

    private void iniciarComponentes() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36)));
        this.setVisible(true);
        this.setContentPane(this.PainelInicial);
       // this.setSize(640, 480);
        this.pack();
    }

    public void alterarFonte(){
        this.titulo.setFont((new Font("Serif", Font.ITALIC, 36)));
        
    }

}
