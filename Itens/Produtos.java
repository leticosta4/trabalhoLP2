package Itens;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Produtos {
    private String nome;
    private double preco;
    private int estoque;
    private String dataValidade;
    private String fabricante;

    private ArrayList<Produtos> ListaProdutos = new ArrayList<Produtos>();

    public Produtos(String nome, double preco, int estoque, String dataValidade, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.dataValidade = dataValidade;
        this.fabricante = fabricante;
    }

    
    public Produtos() {
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public ArrayList<Produtos> getListaProdutos() {
        return ListaProdutos;
    }

    public void setListaProdutos(ArrayList<Produtos> listaProdutos) {
        ListaProdutos = listaProdutos;
    }

    // public Produtos criarProduto() {
    //     Scanner in = new Scanner(System.in);
    //     String nome, fabricante, validade, tarja, dataFabricacao, cor;
    //     int estoque, tipo, tamPacote;
    //     double price;
    //     boolean resistenciaAgua = false;
        
 

    //     System.out.println("Nome do produto:");
    //     nome = in.next();
    //     System.out.println("Preço do produto:");
    //     price = in.nextDouble();
    //     System.out.println("Estoque do produto:");
    //     estoque = in.nextInt();
    //     System.out.println("Data de validade do produto:");
    //     validade = in.next();
    //     System.out.println("Fabricante do produto:");
    //     fabricante = in.next();

    //     System.out.println("""
    //                 Qual o tipo do produto?
    //                 1 - Remédio
    //                 2 - Cosmético
    //                 3 - Higiênico
    //                 4 - Petiscos
    //             """);
    //     tipo = in.nextInt();

    //     switch (tipo) {
    //         case 1:
    //             System.out.println("Qual a tarja do remédio? ");
    //             tarja = in.next();
    //             Remedios remedio = new Remedios(nome, price, estoque, validade, fabricante, tarja);
    //             break;
    //         case 2:
    //             System.out.println("Qual a cor do produto?");
    //             cor = in.next();
    //             System.out.println("Tem resistência à água? [s/n]" );
    //             resistenciaAgua = in.nextBoolean();
                

    //             break;
    //         case 3:

    //             break;

    //         default:
    //             break;
    //     }
    //     in.close();
    // }
}