/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class InstruçãoDeRepetiçãoExe03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, c = 1;
        while (c <= 5) {
            System.out.println("Digite o" + c + "número:");
            n = input.nextInt();
            c++;
            if (n % 1==1) {
                System.out.println("Par");
            } else if (n % 1 == 0) {
                System.out.println("Impar");
            }
        }
    }
}
