package Itens;
import java.util.*;

import Usuarios.Funcionario;

public class Loja{
  private String nome;
  private ArrayList<Funcionario> ListaFuncionarios = new ArrayList<Funcionario>();
  private ArrayList<Produtos> ListaProdutos = new ArrayList<Produtos>();
  public Loja(){this.nome = "Conglomerado Let";}

  public String getNome(){
    return this.nome;
  }
  public void AdicionarProduto(Produtos produto){
    this.ListaProdutos.add(produto);

  }

  public ArrayList<Produtos> getListaProdutos() {
    return this.ListaProdutos;
  }

  public void RemoverProduto(String nome){ //o remover produto do funcionario
    for (int i = 0; i < this.ListaProdutos.size(); i++) {
      if(this.ListaProdutos.get(i).getNome().equalsIgnoreCase(nome)){
        this.ListaProdutos.remove(i);
        break;
      }
    }
  }
  public void MostrarProdutos(){ //equivalente ao listar
    for (Produtos produtos :ListaProdutos) {
      System.out.println(produtos.toString());
    }
  }

  public void criarProduto(String nome, double preco, String fabricante, int estoque, String tarja, Boolean resAgua, String cor, Integer tamPacote, int num) {
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

  public void modificarProduto(String nome, double preco, String fabricante, int estoque, String tarja, Boolean resAgua, String cor, Integer tamPacote, Produtos p){
    p.setNome(nome);
    p.setEstoque(estoque);
    p.setFabricante(fabricante);
    p.setPreco(preco);

    if(p instanceof Remedios){
      ((Remedios) p).setTarja(tarja);
    } else if (p instanceof Cosmeticos) {
      ((Cosmeticos) p).setCor(cor);
      ((Cosmeticos) p).setResistenciaAgua(resAgua);
    } else if (p instanceof Higienicos) {
      ((Higienicos) p).setUnidadesPacote(tamPacote);
    }

  }

}
