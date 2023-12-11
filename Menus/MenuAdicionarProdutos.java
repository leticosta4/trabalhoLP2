package Menus;

import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MenuAdicionarProdutos extends JFrame implements ActionListener , KeyListener {
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
    Produtos modificar = null;

    Loja let = new Loja();

    public MenuAdicionarProdutos(Loja loja) {
        this.let = loja;
        adicionarComponentes();
        limparTexto();
    }

    public MenuAdicionarProdutos(Produtos p, String classeRecebida, Loja loja) {
        this.let = loja;
        this.modificar = p;
        adicionarComponentes();
        this.tiposProdutosBox.setVisible(false);
        setarProdutosBox(classeRecebida);
        limparTexto();
        this.pack();

    }

    private void adicionarComponentes() {
        this.setVisible(true);
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        this.setContentPane(this.painelAdicionarProdutos);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setarActionListerner();
        setarKeyListener();
        this.pack();
    }
    private void setarActionListerner(){ //mesma coisa que o metodo botoes() faz nas outras classes
        tiposProdutosBox.addActionListener(this);
        confirmar.addActionListener(this);
        sairButton.addActionListener(this);
    }
    private void setarKeyListener(){
        estoqueProdutoText.addKeyListener(this);
        corProdutoText.addKeyListener(this);
        precoProdutoText.addKeyListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource() == tiposProdutosBox || e.getSource() == confirmar)) {
            String selectedOption = (String) tiposProdutosBox.getSelectedItem();
            // Verifica a opção selecionada e ajusta a visibilidade dos rótulos
            if (selectedOption != null) {
                switch (selectedOption) {
                    case "Remédios" -> {
                       liberarOpcoesRemedio();
                        if (e.getSource() == confirmar) {
                            pegarTexto(1);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");
                        }
                    }
                    case "Cosméticos" -> {
                        liberarOpcoesCosmeticos();
                        if (e.getSource() == confirmar) {
                            pegarTexto(2);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");
                        }
                    }
                    case "Higiênicos" -> {
                        liberarOpcoesHigienicos();
                        if (e.getSource() == confirmar) {
                            pegarTexto(3);
                            JOptionPane.showMessageDialog(confirmar, "Produto Adicionado Com Sucesso");

                        }
                    }
                }
                limparTexto();
                this.pack();
            }
        }  else if (e.getSource() == sairButton) {
            dispose();
        }
    }

    private void pegarTexto(int num){
        String nomeProd = nomeProdutoText.getText();
        double preco  =  Double.parseDouble(precoProdutoText.getText());
        String fabricante = fabricanteProdutoText.getText();
        int estoque = Integer.parseInt(estoqueProdutoText.getText());
        String tarja = "";
        String cor = "";
        String resistenciaAgua = "";
        Boolean resistenciaAguaBoolean = false;
        int tamanho = 0;


        System.out.printf("Num - %d\nPreco = %f\nNome = %s\nfabricnte = %s\nestoque = %d\ntarja %s\n,cor %s\nresAgua %b,Tamnanho %d\n",num,preco,nomeProd,fabricante,estoque,tarja,cor,resistenciaAguaBoolean,tamanho);
    if(modificar == null) {
        switch (num) {
            case 1:
                tarja = tarjaBox.getSelectedItem().toString();
                this.let.criarProduto(nomeProd, preco, fabricante, estoque, tarja, null, null, null, num);
                break;
            case 2:
                cor = corProdutoText.getText();
                resistenciaAgua = resistenciaAguaBox.getSelectedItem().toString();
                resistenciaAguaBoolean = resistenciaAgua.equals("Sim");
                this.let.criarProduto(nomeProd, preco, fabricante, estoque, null, resistenciaAguaBoolean, cor, null, num);
                break;
            case 3:
                tamanho = Integer.parseInt(tamanhoProdutoText.getText());
                this.let.criarProduto(nomeProd, preco, fabricante, estoque, null, null, null, tamanho, num);
                break;
        }
    }
    else{
        System.out.println("Entrei no else");
        String classeModificara = modificar.getClass().getSimpleName();
        System.out.println("Nome simples -" + classeModificara);

        if((classeModificara.contains("Remedio"))) {
            System.out.println("Aqui é rem");
            tarja = tarjaBox.getSelectedItem().toString();
        }
        else if(classeModificara.contains("Cosmetico")) {
            System.out.println("Aqui é cosm");
            cor = corProdutoText.getText();
            resistenciaAgua = resistenciaAguaBox.getSelectedItem().toString();
            resistenciaAguaBoolean = resistenciaAgua.equals("Sim");
        }
        else if(classeModificara.contains("Higienico")) {
            System.out.println("Aqui é hig");
            tamanho = Integer.parseInt(tamanhoProdutoText.getText());
        }

        this.let.modificarProduto(nomeProd,preco,fabricante,estoque,tarja,resistenciaAguaBoolean,cor,tamanho, modificar);
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

    @Override
    public void keyTyped(KeyEvent e) {
        char charColetado = e.getKeyChar();
        if(e.getSource() == estoqueProdutoText) {
            if (!Character.isDigit(charColetado) && charColetado != KeyEvent.VK_BACK_SPACE && charColetado != KeyEvent.VK_DELETE) e.consume(); //Só Numero
        }
        else if (e.getSource() == corProdutoText) {
            if(Character.isDigit(charColetado)) e.consume(); //Só letra
            }
        else if (e.getSource() == precoProdutoText) {
            if (!Character.isDigit(charColetado) && (charColetado != KeyEvent.VK_BACK_SPACE) && (charColetado != KeyEvent.VK_DELETE) && charColetado != KeyEvent.VK_PERIOD) e.consume(); //Só numeros e o ponto '.' por causa do double
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void setarProdutosBox(String nomeClasse){
        System.out.println("Classe ------" + nomeClasse);
        if(nomeClasse.contains("Cosmeticos")){
            System.out.println("COs");
            liberarOpcoesCosmeticos();
        }
        else if (nomeClasse.contains("Remedios")) {
            System.out.println("Rem");
            liberarOpcoesRemedio();
        }
        else if(nomeClasse.contains("Higienicos")){
            System.out.println("Hig");
            liberarOpcoesHigienicos();
        }
    }

    private void liberarOpcoesRemedio(){
        tarja.setVisible(true);
        tarjaBox.setVisible(true);
        resistenciaAgua.setVisible(false);
        resistenciaAguaBox.setVisible(false);
        tamanho.setVisible(false);
        tamanhoProdutoText.setVisible(false);
        corProdutoText.setVisible(false);
        cor.setVisible(false);
    }

    private void liberarOpcoesHigienicos(){
        tarja.setVisible(false);
        tarjaBox.setVisible(false);
        resistenciaAgua.setVisible(false);
        resistenciaAguaBox.setVisible(false);
        tamanho.setVisible(true);
        tamanhoProdutoText.setVisible(true);
        corProdutoText.setVisible(false);
        cor.setVisible(false);
    }
    private void liberarOpcoesCosmeticos(){
        tarja.setVisible(false);
        tarjaBox.setVisible(false);
        resistenciaAgua.setVisible(true);
        resistenciaAguaBox.setVisible(true);
        tamanho.setVisible(false);
        tamanhoProdutoText.setVisible(false);
        corProdutoText.setVisible(true);
        cor.setVisible(true);
    }
}
