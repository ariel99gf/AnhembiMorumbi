
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ariel
 */
public class test {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Entre com um numero");
        int i = Integer.parseInt(entrada);
        System.out.println(entrada);
    }
}
