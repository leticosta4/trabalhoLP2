package Menus.funcionarioFuncoes;

import Itens.Loja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdicionarProdutos extends JFrame implements ActionListener {
    private JComboBox tiposProdutosBox;
    private JPanel painelAdicionarProdutos;
    private JTextField fabricanteProdutoText;
    private JTextField corProdutoText;
    private JTextField estoqueProdutoText;
    private JTextField tamanhoProdutoText;
    private JTextField precoProdutoText;
    private JTextField nomeProdutoText;
    private JComboBox tarjaBox;
    private JComboBox resistenciaAguaBox;
    private JLabel resistenciaAgua;
    private JLabel tarja;
    private JLabel tamanho;
    private JLabel estoque;
    private JLabel fabricante;
    private JLabel preco;
    private JLabel nome;
    private JLabel cor;
    private JLabel informacao;
    private JButton confirmar;
    private JButton sairButton;

    Loja let = new Loja();

    public MenuAdicionarProdutos(Loja loja) {
        this.let = loja;
        adicionarComponentes();
    }

    private void adicionarComponentes() {
        this.setVisible(true);
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setContentPane(this.painelAdicionarProdutos);
        tiposProdutosBox.addActionListener(this);
        confirmar.addActionListener(this);
        sairButton.addActionListener(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tiposProdutosBox || e.getSource() == confirmar) {
            String selectedOption = (String) tiposProdutosBox.getSelectedItem();
            // Verifica a opção selecionada e ajusta a visibilidade dos rótulos
            if (selectedOption != null) {
                switch (selectedOption) {
                    case "Remédios" -> {
                        tarja.setVisible(true);
                        tarjaBox.setVisible(true);
                        resistenciaAgua.setVisible(false);
                        resistenciaAguaBox.setVisible(false);
                        tamanho.setVisible(false);
                        tamanhoProdutoText.setVisible(false);
                        corProdutoText.setVisible(false);
                        cor.setVisible(false);
                        if (e.getSource() == confirmar) {
                            pegarTexto(1);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");
                        }
                    }
                    case "Cosméticos" -> {
                        tarja.setVisible(false);
                        tarjaBox.setVisible(false);
                        resistenciaAgua.setVisible(true);
                        resistenciaAguaBox.setVisible(true);
                        tamanho.setVisible(false);
                        tamanhoProdutoText.setVisible(false);
                        corProdutoText.setVisible(true);
                        cor.setVisible(true);
                        if (e.getSource() == confirmar) {
                            pegarTexto(2);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");


                        }
                    }
                    case "Higiénicos" -> {
                        tarja.setVisible(false);
                        tarjaBox.setVisible(false);
                        resistenciaAgua.setVisible(false);
                        resistenciaAguaBox.setVisible(false);
                        tamanho.setVisible(true);
                        tamanhoProdutoText.setVisible(true);
                        corProdutoText.setVisible(false);
                        cor.setVisible(false);
                        if (e.getSource() == confirmar) {
                            pegarTexto(3);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");

                        }
                    }
                }
                limparTexto();
                this.pack();
            }
        } else if (e.getSource() == sairButton) {
            dispose();
        }
    }

    private void pegarTexto(int num){
        String nomeProd = nomeProdutoText.getText();
        double preco  =  Double.parseDouble(precoProdutoText.getText());
        String fabricante = fabricanteProdutoText.getText();
        int estoque = Integer.parseInt(estoqueProdutoText.getText());

        switch (num) {
            case 1:
                String tarja = tarjaBox.getSelectedItem().toString();
                this.let.criarProduto(nomeProd,preco,fabricante,estoque,tarja, null,null,null,num);
                break;
            case 2:
                String resistenciaAgua = resistenciaAguaBox.getSelectedItem().toString();
                boolean resistenciaAguaBoolean = resistenciaAgua.equals("Sim");
                String cor = corProdutoText.getText();
                this.let.criarProduto(nomeProd,preco,fabricante,estoque,null, resistenciaAguaBoolean,cor, null,num);
                break;
            case 3:
                int tamanho = Integer.parseInt(tamanhoProdutoText.getText());
                this.let.criarProduto(nomeProd,preco,fabricante,estoque,null,null,null,tamanho,num);
                break;
        }
    }


        private void limparTexto(){
            this.nomeProdutoText.setText("");
            this.precoProdutoText.setText("");
            this.estoqueProdutoText.setText("");
            this.fabricanteProdutoText.setText("");
            this.corProdutoText.setText("");
            this.tamanhoProdutoText.setText("");

        }
}
