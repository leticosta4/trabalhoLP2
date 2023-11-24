package Usuarios;

// import java.util.Scanner;

public class Funcionario {

    private String senha;
    private String login;

    public Funcionario(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}