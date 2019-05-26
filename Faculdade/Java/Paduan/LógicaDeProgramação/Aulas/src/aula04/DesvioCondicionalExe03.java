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
public class DesvioCondicionalExe03 {

    public static void main(String[] args) {
        int num, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números");
        num = input.nextInt();
        num2 = input.nextInt();

        if (num >= num2 && num <= num2) {
            System.out.println(num2 + " " + num);
        }
    }
}
