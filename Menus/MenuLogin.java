package Menus;

import Menus.funcionarioFuncoes.MenuFuncionario;
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

                if(!loginValido(loginUsuario) || !senhaValida(senhaUsuario))
                    if(!loginValido(loginUsuario))
                        JOptionPane.showMessageDialog(Logar,"Login Inválido");
                    else
                        JOptionPane.showMessageDialog(Logar,"Senha Inválida");
                else {
                    MenuFuncionario menuFuncionario = new MenuFuncionario();
                    dispose();
                }
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
        return senhaDoUsuario.equals(teste.getSenha());
    }


    private void adicionarComponentes(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.PainelLogin);
        this.setVisible(true);
        this.setSize(800,640);
        alteracaoFontes();

    }

    private void alteracaoFontes(){
        bemVindo.setFont(new Font("Serif", Font.BOLD,36));
        informacao.setFont(new Font("Arial", Font.BOLD,26));
    }
}
