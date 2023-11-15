package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCliente extends JFrame {
    private JPanel MenuCliente;
    private JButton LojaButton;
    private JButton sairButton;
    private JButton carrinhoButton;
    private JLabel mensagem;

    public MenuCliente() {
        adicionarComponentes();
        alteracaoFontes();
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuInicial menuInicial = new MenuInicial();
                dispose();
            }
        });
    }

    private void adicionarComponentes(){
        Dimension ideal = new Dimension(800, 300);
        this.setContentPane(this.MenuCliente);
        this.setVisible(true);
        this.setMinimumSize(ideal);
        this.setSize(ideal);
        this.setLocationRelativeTo(null);
        alteracaoFontes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void alteracaoFontes(){
        mensagem.setFont(new Font("Serif", Font.BOLD,36));
//        .setFont(new Font("Arial", Font.BOLD,26));
    }
}