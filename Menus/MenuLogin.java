package Menus;

import Usuarios.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLogin extends JFrame {
    private JPasswordField senha;
    private JTextField Login;
    protected JPanel PainelLogin;
    private JButton Logar;
    private JButton voltarButton;
    private JLabel informacao;
    private JLabel bemVindo;


    Funcionario teste = new Funcionario("1234", "Kaik");

    public MenuLogin() {
        adicionarComponentes();
        Logar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginUsuario = Login.getText();
                char[] senhaUsuario = senha.getPassword();

                if(!loginValido(loginUsuario) && !senhaValida(senhaUsuario)) JOptionPane.showMessageDialog(Logar,"Login Inválido");
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuInicial menuInicial = new MenuInicial();
                dispose();

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


    private void adicionarComponentes(){
        this.setContentPane(this.PainelLogin);
        this.setVisible(true);
        this.setSize(800,640);
        this.setLocationRelativeTo(null);
        alteracaoFontes();

    }

    private void alteracaoFontes(){
        bemVindo.setFont(new Font("Serif", Font.BOLD,36));
        informacao.setFont(new Font("Arial", Font.BOLD,26));
    }
}
