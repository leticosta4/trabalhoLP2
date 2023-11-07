package Usuarios;

public class Funcionario {

    private int senha;


    private String login;


    public Funcionario(int senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}