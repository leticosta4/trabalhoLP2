package Itens;

public class Cosmeticos extends Produtos {

    private boolean resistenciaAgua;
    private String cor;

    public Cosmeticos(String nome, double preco, int estoque,String fabricante, boolean resistenciaAgua, String cor) {
        super(nome, preco, estoque, fabricante);
        this.resistenciaAgua = resistenciaAgua;
        this.cor = cor;
        this.setPreco(calcValor());
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

    public double calcValor(){
        return this.resistenciaAgua? this.getPreco() * 1.30: this.getPreco();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(null + " | %b | %s |" + null + " | ", this.isResistenciaAgua(), this.getCor());
    }
}