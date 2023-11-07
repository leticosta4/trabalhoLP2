package Produtos;

public class Higienicos extends Produtos implements Desconto {


    public int tamPacote;


    public Higienicos(String nome, double preco, int estoque, String dataValidade, String fabricante, int tamPacote) {
        super(nome, preco, estoque, dataValidade, fabricante);
        this.tamPacote = tamPacote;
        this.setPreco(calcPreco());
    }

    public int getTamPacote() {
        return tamPacote;
    }

    public void setTamPacote(int tamPacote) {
        this.tamPacote = tamPacote;
    }


    public double calcPreco(){
        return this.getPreco() * this.tamPacote;
    }
    @Override
    public void setDesconto() {

    }
}