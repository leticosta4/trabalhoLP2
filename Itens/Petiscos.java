package Itens;

import java.time.LocalDate;

public class Petiscos extends Produtos implements Desconto {

    private String dataFabricacao;

    public Petiscos(String nome, double preco, int estoque, String fabricante, String dataFabricacao) {
        super(nome, preco, estoque, fabricante);
        this.dataFabricacao = dataFabricacao;
        this.setPreco(setDesconto());
    }
    public String getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String criarValidade(String dataFabricacao){
        //vai ser o padrao de 90 dias apos fabricaçao
        //01/34/6789
        //mexer so no mes se for <= 9, se não muda o ano tbm
//        LocalDate fab = LocalDateof();

        int mes = 0, ano = 0;
        String mes2, ano2;
        mes2 = dataFabricacao.substring(3, 5);
        if(Integer.parseInt(mes2) + 3 > 12){
            ano2 = dataFabricacao.substring(6, 10);
            ano = Integer.parseInt(ano2) + 1;
        } else{
            mes = Integer.parseInt(mes2) + 3;
        }
        return "a";
    }
    @Override
    public double setDesconto() {
        return this.getPreco() / 1.15;
    }
}