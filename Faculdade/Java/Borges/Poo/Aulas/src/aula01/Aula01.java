/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char[] v = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe sua resposta: ");
            int cal = input.nextLine().charAt(0);
            System.out.println("\tA reposta correta é: " + v[i]);
            if (cal == v[i]) {
                float quest=2;
                System.out.println(quest);
            } else {
                System.out.println("\tErrou");
            }
        }

    }

}
