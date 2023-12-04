package Menus;

import Itens.Loja;
import Itens.Produtos;
import Menus.funcionarioFuncoes.MenuFuncionario;
import Usuarios.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuLogin extends JFrame implements ActionListener {
    private JPasswordField senha;
    private JTextField Login;
    protected JPanel PainelLogin;
    private JButton Logar;
    private JButton voltarButton;
    private JLabel informacao;
    private JLabel bemVindo;
    private Loja loja;
    Funcionario teste = new Funcionario("1234", "Kaik");

    public MenuLogin(Loja loja) {
        this.loja = loja;
        adicionarComponentes();
    }

    boolean loginValido(String usuario){
        return usuario.equalsIgnoreCase(teste.getLogin());
    }

    boolean senhaValida(char[] senha){
        String senhaDoUsuario = new String(senha);
        return senhaDoUsuario.equals(teste.getSenha());
    }


    private void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(640,480);
        botoes(); //nao altera o this.pack
        this.setLocationRelativeTo(null); //p deixar a tela no meio
        this.setContentPane(this.PainelLogin);
        this.pack(); //junta tudo
    }

    private void botoes(){
        Logar.addActionListener(this);
        voltarButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Logar){
            realizarLogin();
        } else if (e.getSource() == voltarButton) {
            dispose();
        }

    }

    private void realizarLogin(){
        String loginUsuario = Login.getText();
        char[] senhaUsuario = senha.getPassword();
        if(!loginValido(loginUsuario) || !senhaValida(senhaUsuario))
            if(!loginValido(loginUsuario))
                JOptionPane.showMessageDialog(Logar,"Login Inválido.");
            else
                JOptionPane.showMessageDialog(Logar,"Senha Inválida.");
        else {
            MenuFuncionario menuFuncionario = new MenuFuncionario(loja);
            dispose();
        }
    }
}
