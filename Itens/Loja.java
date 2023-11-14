package Itens;
import java.util.ArrayList;
import Usuarios.Funcionario;

public class Loja {
  private String nome;
  private ArrayList<Funcionario> ListaFuncionarios = new ArrayList<Funcionario>();
  private ArrayList<Produtos> ListaProdutos = new ArrayList<Produtos>();


  public Loja(){
    this.nome = "Conglomerado Let";
  }

  public void AdicionarProduto(Produtos produto){
    this.ListaProdutos.add(produto);
  }
  public void RemoverProduto(String nome){
    for (int i = 0; i < ListaProdutos.size(); i++) {
      if(ListaProdutos.get(i).getNome().equalsIgnoreCase(nome)){
        ListaProdutos.remove(i);
        break;
      }
    }
  }
  
  public void MostrarProdutos(){
    for (Produtos produtos :ListaProdutos) {
      System.out.printf("Nome produto: %s | Preço: %.2f | Estoque: %d |\n", produtos.getNome(), produtos.getPreco(), produtos.getEstoque());
    }
  }
  public void AdimitirFuncionario(Funcionario funcionario){
    this.ListaFuncionarios.add(funcionario);
  }
  public void demitirFuncionario(String login){
    for (int i = 0; i < ListaFuncionarios.size(); i++) {
      if(ListaFuncionarios.get(i).getLogin().equalsIgnoreCase(login)){
        ListaFuncionarios.remove(i);
        break;
      }
    }
  }
  public String getNome(){
    return this.nome;
  }
}
