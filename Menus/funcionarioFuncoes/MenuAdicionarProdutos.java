package Menus.funcionarioFuncoes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdicionarProdutos extends JFrame implements ActionListener {
    private JComboBox tiposProdutosBox;
    private JPanel painelAdicionarProdutos;
    private JTextField fabricanteProdutoText;
    private JTextField corProduto;
    private JTextField estoqueProdutoText;
    private JTextField tamanhoProdut;
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


    public MenuAdicionarProdutos()  {
        adicionarComponentes();
    }
    private void adicionarComponentes(){
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        this.setContentPane(this.painelAdicionarProdutos);
        tiposProdutosBox.addActionListener(this);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tiposProdutosBox){
                String selectedOption = (String) tiposProdutosBox.getSelectedItem();
            System.out.println(selectedOption);
                // Verifica a opção selecionada e ajusta a visibilidade dos rótulos
                if (selectedOption != null) {
                    if (selectedOption.equals("Remédios")) {
                        tarja.setVisible(true);
                        resistenciaAgua.setVisible(false);
                        resistenciaAguaBox.setVisible(false);
                    } else if (selectedOption.equals("Cosméticos")) {

                    } else if (selectedOption.equals("Higiénicos")) {

                    }
                }
            }
        }





    public static void main(String[] args) {
        MenuAdicionarProdutos menuAdicionarProdutos = new MenuAdicionarProdutos();
    }

}
