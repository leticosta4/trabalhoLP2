
public class Higienicos extends Produtos implements Desconto {


    public int tamPacote;


    public Higienicos(String nome, double preco, int estoque, String dataValidade, String fabricante, int tamPacote) {
        super(nome, preco, estoque, dataValidade, fabricante);
        this.tamPacote = tamPacote;
    }

    public int getTamPacote() {
        return tamPacote;
    }

    public void setTamPacote(int tamPacote) {
        this.tamPacote = tamPacote;
    }

    @Override
    public void setDesconto() {

    }
}