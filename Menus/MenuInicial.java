package Menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuInicial extends JFrame{
    private JButton funcionarioButton;
    private JButton clienteButton;
    public JPanel PainelInicial;


    public MenuInicial(){
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(funcionarioButton, "Indo para a tela de login");
                MenuLogin menuLogin = new MenuLogin();
                menuLogin.setContentPane(menuLogin.PainelLogin);
                menuLogin.setVisible(true);
                menuLogin.setSize(300,300);
                dispose();
            }

        });
    }

}






