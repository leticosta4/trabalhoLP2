package Menus.funcionarioFuncoes;


import Itens.Loja;
import Itens.Produtos;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class MenuListarProdutos extends JFrame implements ListSelectionListener, ActionListener{

    private JPanel PainelP;
    private JComboBox<String> comboBox1;
    private JScrollPane scrollpane1;
    private JScrollPane scrollpane2;
    private JLabel infoPane;
    private JTextField pesquisaTextField;
    private JList<String> listProds;
    private JLabel pesquisaLabel;
    private DefaultListModel<Produtos> dlm = new DefaultListModel<>();
    private Loja loja;
    public MenuListarProdutos(Loja loja){
        this.loja = loja;
        adicionarComponentes();
        listarProdutos(loja);
    }

    public void adicionarComponentes(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(this.PainelP);
        this.setVisible(true);
        this.setSize(640,480);
        this.setLocationRelativeTo(null);
        this.pesquisaTextField.setText("");
        botoes();
    }
    private void botoes() {
        listProds.addListSelectionListener(this);
        pesquisaTextField.addActionListener(this);
    }
    private void listarProdutos(Loja loja){
        DefaultListModel<String> dlmS = new DefaultListModel<>();
        ArrayList<Produtos> prod = loja.getListaProdutos();

        String textoEscolhido = pesquisaTextField.getText().toLowerCase();

            for (Produtos produtos : prod) {
                if (produtos.getNome().toLowerCase().contains(textoEscolhido)) {
                    this.dlm.addElement(produtos);
                    dlmS.addElement(produtos.getNome());
                }
            }
        this.listProds.setModel(dlmS);
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        String base = "Nome: " + dlm.get(listProds.getSelectedIndex()).getNome() +
                "<br>Preço: R$ " + dlm.get(listProds.getSelectedIndex()).getPreco() +
                "<br>Estoque: " + dlm.get(listProds.getSelectedIndex()).getEstoque();
        this.infoPane.setText("<html>" + dlm.get(listProds.getSelectedIndex()).toString() + "</body></html>");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pesquisaTextField){
            listarProdutos(loja);
        }
    }
}


