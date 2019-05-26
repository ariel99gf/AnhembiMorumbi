/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DesvioCondicionalExe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("digite o número");
        num = input.nextInt();

        if (num >= 50 && num <= 100) {
            System.out.println("O número que digitou é " + num);
        } else {
            System.out.println("Não pertence ao intervalo");
        }
    }
}
