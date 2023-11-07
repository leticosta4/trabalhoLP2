import Itens.Higienicos;
import Itens.Produtos;
import Itens.Remedios;
import Usuarios.Cliente;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Caique", "12344321", true, true, 20);
        Produtos remedio01 = new Remedios("Tylenol", 50.0, 2, "10/05/2021","Leticia");
        Produtos remedio02 = new Remedios("Dipirona", 100, 3,"10/20/2023", "Kainan Entrepise");
        Produtos higienico01 = new Higienicos("Papel", 50, 5, "20/30/2023", "Bauduco", 2);
        cliente01.adicionarNoCarrinho(remedio01);
        cliente01.adicionarNoCarrinho(remedio02);
        cliente01.adicionarNoCarrinho(higienico01);
        cliente01.listarCarrinho();
    }
}
