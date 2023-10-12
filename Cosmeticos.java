public class Cosmeticos extends Produtos implements Desconto {


    private boolean resistenciaAgua;
    private String cor;

    public Cosmeticos(String nome, double preco, int estoque, String dataValidade, String fabricante, boolean resistenciaAgua, String cor) {
        super(nome, preco, estoque, dataValidade, fabricante);
        this.resistenciaAgua = resistenciaAgua;
        this.cor = cor;
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
    public void setDesconto() {

    }
}