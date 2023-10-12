
public abstract class Produtos {

    private String nome;
    private double preco;
    private int estoque;
    private String dataValidade;
    private String fabricante;


    public Produtos(String nome, double preco, int estoque, String dataValidade, String fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.dataValidade = dataValidade;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}