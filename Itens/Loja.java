package Itens;
import java.util.ArrayList;
import java.util.Scanner;

import Usuarios.Funcionario;

public class Loja {
  private String nome;
  private ArrayList<Funcionario> ListaFuncionarios = new ArrayList<Funcionario>();
  private ArrayList<Produtos> ListaProdutos = new ArrayList<Produtos>();
  public Loja(){
    this.nome = "Conglomerado Let";
  }

  public String getNome(){
    return this.nome;
  }
  public void AdicionarProduto(Produtos produto){
    this.ListaProdutos.add(produto);
  }
  public void RemoverProduto(String nome){ //o remever produto do funcionario
    for (int i = 0; i < ListaProdutos.size(); i++) {
      if(ListaProdutos.get(i).getNome().equalsIgnoreCase(nome)){
        ListaProdutos.remove(i);
        break;
      }
    }
  }
  public void MostrarProdutos(){ //equivalente ao listar
    for (Produtos produtos :ListaProdutos) {
      System.out.printf("Nome produto: %s | Preço: %.2f | Estoque: %d |\n", produtos.getNome(), produtos.getPreco(), produtos.getEstoque());
    }
  }

  public void criarProduto() { //o inserir produto do funcionario
    Scanner in = new Scanner(System.in);
    String nome, fabricante, validade, tarja, dataFabricacao, cor;
    int estoque, tipo, tamPacote;
    char resistente;
    double price;
    boolean resistenciaAgua;

    System.out.println("Nome do produto:");
    nome = in.next();
    System.out.println("Preço do produto:");
    price = in.nextDouble();
    System.out.println("Estoque do produto:");
    estoque = in.nextInt();
    System.out.println("Data de validade do produto:(Digite '00' caso não exista)");
    validade = in.next();
    System.out.println("Fabricante do produto:");
    fabricante = in.next();

    System.out.println("""
                     Qual o tipo do produto?
                     1 - Remédio
                     2 - Cosmético
                     3 - Higiênico
                     4 - Petiscos
                 """);
    tipo = in.nextInt();

    switch(tipo) {
      case 1:
        System.out.println("Tarja do remédio? ");
        tarja = in.next();
        Remedios remedio = new Remedios(nome, price, estoque, validade, fabricante, tarja);
        AdicionarProduto(remedio);
        break;
      case 2:
        System.out.println("Cor do produto?");
        cor = in.next();
        System.out.println("Tem resistência à água? [s/n]");
        resistente = in.next().charAt(0);
        if (resistente == 's') {
          resistenciaAgua = true;
        } else{ resistenciaAgua = false; }
        Cosmeticos cosmetico = new Cosmeticos(nome, price, estoque, validade, fabricante, resistenciaAgua, cor);
        AdicionarProduto(cosmetico);
        break;
      case 3:
        System.out.println("Tamanho do pacote do produto?");
        System.out.println("""
                     Qual o tipo do produto?
                     2 - P
                     3 - M
                     4 - G
                 """);
        tamPacote = in.nextInt();
        Higienicos higienico = new Higienicos(nome, price, estoque, validade, fabricante, tamPacote);
        AdicionarProduto(higienico);
        break;
      case 4:
        System.out.println("Data de fabricação");
        dataFabricacao = in.next();
        Petiscos petisco = new Petiscos(nome, price, estoque, fabricante, dataFabricacao);
        AdicionarProduto(petisco);
        break;
      default:
        break;
    }
    in.close();
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
}
