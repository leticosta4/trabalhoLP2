package Produtos;

public class Petiscos extends Produtos implements Desconto {


    private String dataFabricacao;


    public Petiscos(String nome, double preco, int estoque, String dataValidade, String fabricante, String dataFabricacao) {
        super(nome, preco, estoque, dataValidade, fabricante);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public void setDesconto() {

    }
}