
import Itens.Higienicos;
import Itens.Loja;
import Itens.Produtos;
import Itens.Remedios;
import Menus.MenuInicial;
import Menus.funcionarioFuncoes.MenuListarProdutos;
import Usuarios.Cliente;
import Menus.*;
import Usuarios.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Loja let = new Loja();
        Produtos remedio01 = new Remedios("Tylenol", 50.0, 2, "10/05/2021", "Leticia", "branca");
        Produtos remedio02 = new Remedios("Dipirona", 100, 3, "10/20/2023", "KainanEntrepise", "preta");
        Produtos higienico01 = new Higienicos("Papel", 50, 5, "20/30/2023", "Bauduco", 2);
        let.AdicionarProduto(remedio01);
        let.AdicionarProduto(remedio02);
        MenuInicial menuInicial = new MenuInicial(let);
        Funcionario f01 = new Funcionario("9145", "kaik");


        let.MostrarProdutos();

    }

}
