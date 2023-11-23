package Itens;

public class Cosmeticos extends Produtos implements Desconto {

    private boolean resistenciaAgua;
    private String cor;

    public Cosmeticos(String nome, double preco, int estoque,String fabricante, boolean resistenciaAgua, String cor) {
        super(nome, preco, estoque, fabricante);
        this.resistenciaAgua = resistenciaAgua;
        this.cor = cor;
        if(resistenciaAgua) this.setPreco((setDesconto() * this.getPreco()) * 1.15);
        else this.setPreco((setDesconto() * this.getPreco()));
    }

    public boolean isResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(boolean resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public double setDesconto() {
        return this.getPreco() / 1.15;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("| %s | %b", this.getCor(), this.isResistenciaAgua());
    }
}