package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame {
    private JPanel painelListaProdutos;
    private JTextArea listaProdutos;
    private JList lista;
    private JScrollBar scrollbar;
    private Loja loja;

    public MenuListarProdutos(Loja loja){
        this.loja = loja;
        adicionarComponentes();
    }

    public void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.painelListaProdutos);
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        listarProdutosMenu(this.loja, this.listaProdutos);
    }

    public static void listarProdutosMenu(Loja loja, JTextArea listaProdutos){
        ArrayList<Produtos> produtos = loja.getListaProdutos(); // Supondo que a loja tenha um método para obter os produtos

        // Limpa a área de texto antes de listar os produtos
        listaProdutos.setText("");

        // Adiciona cada produto à área de texto
        for (Produtos produto : produtos) {
            listaProdutos.append(produto.getNome() + ": " + produto.getPreco() + "\n");
        }
    }

}


