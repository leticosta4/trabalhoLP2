package Itens;

public class Higienicos extends Produtos {


    public int tamPacote;


    public Higienicos(String nome, double preco, int estoque, String fabricante, int tamPacote) {
        super(nome, preco, estoque, fabricante);
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
        return (this.getPreco() * this.tamPacote) * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(null + " | " + null + " | " + null + " | %d |", this.getTamPacote());
    }
}