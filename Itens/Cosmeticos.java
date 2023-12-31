package Itens;

public class Cosmeticos extends Produtos {

    private boolean resistenciaAgua;
    private String cor;

    public Cosmeticos(String nome, double preco, int estoque,String fabricante, boolean resistenciaAgua, String cor) {
        super(nome, preco, estoque, fabricante);
        this.resistenciaAgua = resistenciaAgua;
        this.cor = cor;

        this.setPreco(calcPreco());
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
    public double calcPreco() {
        return this.resistenciaAgua? this.getPreco() * 1.30: this.getPreco();
    }

    @Override
    public String toString() {
        String res = "não";
        if(this.resistenciaAgua) res = "sim";
        return super.toString() + String.format("Resistência a água: %s <br>Cor: %s", res, this.getCor());
//        return super.toString() + String.format(); //retornava string com todos os atributod
    }
}