package Menus;

import Usuarios.Funcionario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLogin extends JFrame {
    private JPasswordField senha;
    private JTextField Login;
    protected JPanel PainelLogin;
    private JButton Logar;

    Funcionario teste = new Funcionario("1234", "Kaik");

    public MenuLogin() {
        Logar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginUsuario = Login.getText();
                char[] senhaUsuario = senha.getPassword();

                if(!loginValido(loginUsuario) && !senhaValida(senhaUsuario)) JOptionPane.showMessageDialog(Logar,"Login Inválido");
            }
        });
    }

    boolean loginValido(String usuario){
        return usuario.equalsIgnoreCase(teste.getLogin());
    }

    boolean senhaValida(char[] senha){
        String senhaDoUsuario = new String(senha);
        return senhaDoUsuario.equalsIgnoreCase(teste.getSenha());
    }
}
