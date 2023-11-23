
import Itens.Higienicos;
import Itens.Loja;
import Itens.Produtos;
import Itens.Remedios;
import Menus.MenuInicial;
import Menus.funcionarioFuncoes.MenuListarProdutos;
import Usuarios.Cliente;
import Menus.*;
import Usuarios.Funcionario;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        setarLookAndFeel();
        Loja let = new Loja();
       // Produtos remedio01 = new Remedios("Tylenol", 50.0, 2, "10/05/2021", "Leticia", "branca");
       // Produtos remedio02 = new Remedios("Dipirona", 100, 3, "10/20/2023", "KainanEntrepise", "preta");
       // Produtos higienico01 = new Higienicos("Papel", 50, 5, "20/30/2023", "Bauduco", 2);
       // let.AdicionarProduto(remedio01);
       // let.AdicionarProduto(remedio02);
        MenuInicial menuInicial = new MenuInicial();
        Funcionario f01 = new Funcionario("9145", "kaik");


        let.MostrarProdutos();

    }
        public static void  setarLookAndFeel(){
            try {
                // Verifica se o Nimbus está disponível
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        // Define o Nimbus como look and feel
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                // Trata exceções relacionadas ao look and feel
                e.printStackTrace();
            }
        }
}
