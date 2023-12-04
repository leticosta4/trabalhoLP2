
import Itens.Loja;
import Menus.MenuInicial;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        setarLookAndFeel();
        Loja let = new Loja();
        MenuInicial menuInicial = new MenuInicial();
    }
        public static void  setarLookAndFeel(){
            try { //caso nao ache o design nimbus
                // Verifica se o Nimbus está disponível
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        // Define o Nimbus como look and feel
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                // Trata exceções relacionadas ao look and feel -
                e.printStackTrace();
            }
        }
}
