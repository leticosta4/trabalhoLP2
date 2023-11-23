package Itens;

public class Remedios extends Produtos implements  Desconto {
    private String tarja;

    public Remedios(String nome, double preco, int estoque, String fabricante, String tarja) {
        super(nome, preco, estoque, fabricante);
        this.tarja = tarja;
        this.setPreco(setDesconto());
    }


    @Override
    public double setDesconto() {
        return this.getPreco() / 1.15;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" |%s" + " | " +null+ " | " + null + " | ", this.getTarja());
    }
}
