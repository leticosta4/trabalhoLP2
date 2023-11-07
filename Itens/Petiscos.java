package Itens;

public class Petiscos extends Produtos implements Desconto {

    private String dataFabricacao;

    public Petiscos(String nome, double preco, int estoque, String dataValidade, String fabricante, String dataFabricacao) {
        super(nome, preco, estoque, dataValidade, fabricante);
        this.dataFabricacao = dataFabricacao;
        this.setPreco(setDesconto());
    }
    public String getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    @Override
    public double setDesconto() {
        return this.getPreco() / 1.15;
    }
}