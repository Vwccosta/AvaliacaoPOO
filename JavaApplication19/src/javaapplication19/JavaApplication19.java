package javaapplication19;

import MODEL.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vander
 */
public class JavaApplication19 {

    public static void main(String[] args) {

        ArrayList<Login> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Login("vander", "123"));
        listaUsuarios.add(new Login("Romario", "123"));
        listaUsuarios.add(new Login("Professora", "123"));

        String UsuarioLogar = JOptionPane.showInputDialog(null, "digite o Usuario");
        String SenhaLogar = JOptionPane.showInputDialog(null, "digite a senha");

        //Se o usuario ou senha for nulo ele imprime um aviso
        if ((UsuarioLogar == null || UsuarioLogar.equals("")) && (SenhaLogar == null || SenhaLogar.equals(""))) {
            JOptionPane.showInputDialog(null, "Digite um usuario(Usuario nulo)");
        } else {
            //Ler os dados do ArrayList
            for (int i = 0; i < listaUsuarios.size(); i++) {
                Login l = listaUsuarios.get(i);
                //se o usuario digitado for igual algum item do array ele continua
                if (UsuarioLogar.equals(l.getUsuario())) {
                    // se a senha for igual ele abre o menu se caso não, vai para a else e começa a contar
                    if (SenhaLogar.equals(l.getSenha())) {
                        //executar menu
                        Menu menu = new Menu();
                        menu.executaMenu();
                    } else {
                        //contador é inicializado em 1 devido a senha já ter sido digitada antes
                        int contador = 1;
                        do {
                            SenhaLogar = JOptionPane.showInputDialog(null, "Redigite sua senha");
                            contador++;
                        } while (contador < 3);
                        String novaSenha = JOptionPane.showInputDialog(null, "redefina sua senha");
                        l.setSenha(novaSenha);
                        Menu menu = new Menu();
                        menu.executaMenu();
                        //Deixe esse print só para teste.
                        System.out.println(l.toString());
                        
                    }

                }

            }

        }

    }
}
