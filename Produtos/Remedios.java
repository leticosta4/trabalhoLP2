package Produtos;

public abstract class Remedios extends Produtos implements  Desconto {

    private String tarja;

    public Remedios(String nome, double preco, int estoque, String dataValidade, String fabricante) {
        super(nome, preco, estoque, dataValidade, fabricante);
    }
    @Override
    public void setDesconto() {
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }
}
}