package Usuarios;

import Itens.Produtos;
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
        if(p.getEstoque() >= 1) {
            p.setEstoque(p.getEstoque() - 1);
            this.carrinhoCompras.add(p);
        }
        else{
            System.out.println("Não há produtos no estoque");
        }
    }

    public void listarCarrinho(){
        for (Produtos produto: carrinhoCompras
             ) {
            System.out.println(produto.getNome());
        }
    }

    public void excluirDoCarrinho(String nomeProduto){
        for (int i = 0; i <carrinhoCompras.size() ; i++) {
            if(nomeProduto.equalsIgnoreCase(carrinhoCompras.get(i).getNome())){
                carrinhoCompras.get(i).setPreco(carrinhoCompras.get(i).getEstoque() + 1);
                carrinhoCompras.remove(i);
                break;
            }
        }
    }

}