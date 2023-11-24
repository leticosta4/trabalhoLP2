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

  public ArrayList<Produtos> getListaProdutos() {
    return ListaProdutos;
  }

  public void RemoverProduto(String nome){ //o remover produto do funcionario
    for (int i = 0; i < ListaProdutos.size(); i++) {
      if(ListaProdutos.get(i).getNome().equalsIgnoreCase(nome)){
        ListaProdutos.remove(i);
        break;
      }
    }
  }
  public void MostrarProdutos(){ //equivalente ao listar
    for (Produtos produtos :ListaProdutos) {
      System.out.println(produtos.toString());
    }
  }

  public void criarProduto(String nome, double preco, String fabricante, int estoque, String tarja, Boolean resAgua, String cor, Integer tamPacote, int num) { //o inserir produto do funcionario
    switch(num) {
      case 1:
        Remedios remedio = new Remedios(nome, preco, estoque, fabricante, tarja);
        AdicionarProduto(remedio);
        break;
      case 2:
        Cosmeticos cosmetico = new Cosmeticos(nome, preco, estoque, fabricante, resAgua, cor);
        AdicionarProduto(cosmetico);
        break;
      case 3:
        Higienicos higienico = new Higienicos(nome, preco, estoque, fabricante, tamPacote);
        AdicionarProduto(higienico);
        break;
    }
  }
}
