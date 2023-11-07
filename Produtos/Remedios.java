package Produtos;

public abstract class Remedios extends Produtos implements Tarja, Desconto {


    public Remedios(String nome, double preco, int estoque, String dataValidade, String fabricante) {
        super(nome, preco, estoque, dataValidade, fabricante);
    }
    @Override
    public void setDesconto() {
    }

    @Override
    public void setTarja(){

    }
}