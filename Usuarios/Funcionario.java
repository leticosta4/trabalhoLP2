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

    // public void opcoes() {
    //     int opt = 0;
    //     Scanner ler = new Scanner(System.in);
    //     while (opt != 6) {
    //     System.out.println("""
    //             1 - Adicionar produto
    //             2 - Consultar produto
    //             3 - Alterar produto
    //             4 - Listar produto
    //             5 - Remover produto
    //             6 - Sair
    //             """);
    //     opt = ler.nextInt();
    //     switch (opt) {
    //         case 1:
                
    //             break;
    //         case 2:
                
    //             break;
    //         case 3:

    //             break;
    //         case 4:

    //             break;
    //         case 5:

    //             break;
    //         case 6:

    //             break;

    //         default:
    //         System.out.println("Erro inválido");
    //             break;
    //     }
    // }
    // ler.close();
    // }

}