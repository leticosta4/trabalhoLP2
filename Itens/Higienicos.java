package Itens;

public class Higienicos extends Produtos {


    public int unidadesPacote;


    public Higienicos(String nome, double preco, int estoque, String fabricante, int unidadesPacote) {
        super(nome, preco, estoque, fabricante);
        this.unidadesPacote = unidadesPacote;
        this.setPreco(calcPreco());
    }

    public int getTamPacote() {
        return unidadesPacote;
    }

    public void setUnidadesPacote(int unidadesPacote) {
        this.unidadesPacote = unidadesPacote;
    }


    public double calcPreco(){
        return this.getPreco() * this.unidadesPacote;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(null + " | " + null + " | " + null + " | %d |", this.getTamPacote());
    }
}