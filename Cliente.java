import Produtos.Produtos;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private boolean cadastrado;
    private boolean receita;
    private int idade;
    private ArrayList<Produtos> carrinhoCompras = new ArrayList<Produtos>();

    public Cliente(String nome, String cpf, boolean cadastrado, boolean receita, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cadastrado = cadastrado;
        this.receita = receita;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionarNoCarrinho(Produtos p){
        this.carrinhoCompras.add(p);
    }

    public void listarCarrinho(String nomeProduto){
        for (Produtos produto: carrinhoCompras
             ) {
            System.out.println(carrinhoCompras.get(produto).getNome());
        }




    }

}