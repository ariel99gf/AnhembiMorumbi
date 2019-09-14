/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author ariel
 */
public class InstruçãoDeRepetiçãoExe02 {

    public static void main(String[] args) {
        double cont = 10;

        while (cont <= 20) {
            System.out.println(cont);
            double soma = cont++ / 2;
            System.out.println(soma);
        }
    }
}
