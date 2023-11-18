
import Itens.Higienicos;
import Itens.Loja;
import Itens.Produtos;
import Itens.Remedios;
import Menus.MenuInicial;
import Usuarios.Cliente;
import Usuarios.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Loja let = new Loja();
        Funcionario f01 = new Funcionario("9145", "kaik");
        //Cliente cliente01 = new Cliente("Caique", true, 19 );
        Produtos remedio01 = new Remedios("Tylenol", 50.0, 2, "10/05/2021", "Leticia", "branca");
        Produtos remedio02 = new Remedios("Dipirona", 100, 3, "10/20/2023", "KainanEntrepise", "preta");
        //Produtos higienico01 = new Higienicos("Papel", 50, 5, "20/30/2023", "Bauduco", 2);
        let.AdicionarProduto(remedio01);
        let.AdicionarProduto(remedio02);

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
    //             let.AdicionarProduto(criarProduto());
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




        // cliente01.adicionarNoCarrinho(remedio01);
        // cliente01.adicionarNoCarrinho(remedio02);
        // cliente01.adicionarNoCarrinho(higienico01);
        // System.out.println("Carrinho 1");
        // cliente01.listarCarrinho();
        // System.out.println("Carrinho 2");
        // cliente01.excluirDoCarrinho("papel");
        // cliente01.listarCarrinho();
    //     let.MostrarProdutos();
    // }

    // public void opcoes(){
    //     System.out.println("""
    //             1 - Adicionar Produtos
    //             2 - Remover Produtos
    //             3 - Editar Produto
    //             4 - Carrinho
    //             """);
    }

}
