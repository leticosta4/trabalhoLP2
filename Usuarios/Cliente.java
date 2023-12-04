package Usuarios;

import Itens.Produtos;
import Itens.Remedios;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private boolean receita;
    private int idade;
    private final ArrayList<Produtos> carrinhoCompras = new ArrayList<Produtos>();

    public Cliente(String nome,  boolean receita, int idade) {
        this.nome = nome;
        this.receita = receita;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ArrayList<Produtos> getCarrinhoCompras() {
        return carrinhoCompras;
    }

    public void adicionarNoCarrinho(Produtos produto){

        if(produto != null) {
            boolean podeComprar = true;
            if (produto instanceof Remedios) {
                podeComprar = verificarTarja((Remedios) produto);
            }
            if (produto.getEstoque() >= 1 && podeComprar) {
                produto.setEstoque(produto.getEstoque() - 1);
                this.carrinhoCompras.add(produto);
            } else {
                System.out.println("Inválido");
            }
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

    public void finalizarCompra(){
        carrinhoCompras.clear();
    }
    public boolean verificarTarja(Remedios remedio){
        if(remedio.getTarja().equalsIgnoreCase("preta")){
            return this.idade >= 18 && this.receita;
        }

        else if (remedio.getTarja().equalsIgnoreCase("vermelha")) {
            return this.receita;
        }
        else{
            return true;
        }
    }

}