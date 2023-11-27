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
    } //if ternario (mais caro se for resistente a agua)

    @Override
    public String toString() {
        String res = "não";
        if(this.resistenciaAgua) res = "sim";
        return super.toString() + String.format("Resistência a água: %s <br>Cor: %s", res, this.getCor());
//        return super.toString() + String.format();
    }
}