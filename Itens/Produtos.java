package Itens;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Produtos {
    private String nome;
    private double preco;
    private int estoque;
    private String fabricante;

    public Produtos(String nome, double preco, int estoque, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.fabricante = fabricante;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return String.format("| %s | %.2f | %d | %s | ", this.getNome(),this.getPreco(), this.getEstoque(), this.getFabricante());
    }
}