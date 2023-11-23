package Itens;

public class Remedios extends Produtos {
    private String tarja;

    public Remedios(String nome, double preco, int estoque, String fabricante, String tarja) {
        super(nome, preco, estoque, fabricante);
        this.tarja = tarja;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s | " + null + " | " + null + " | " + null + " | ", this.getTarja());
    }
}
