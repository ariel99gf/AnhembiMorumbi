/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DesvioCondicionalAninhadoExe04 {

    public static void main(String[] args) {
        double sal;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        sal = input.nextInt();

        if (sal <= 1434.59f) {
            System.out.println("você está isento de imposto");
        } else if (sal >= 1434.60 && sal <= 2150) {
            System.out.println("você paga 7,5% de imposto");
        } else if (sal >= 2150.01 && sal <= 2866.70) {
            System.out.println("você paga 15% de inposto");
        } else if (sal >= 2866.71 && sal <= 3852) {
            System.out.println("você paga 22% de imposto");
        } else if (sal > 3852.01) {
            System.out.println("você paga 27,5% de imposto");
        }
    }
}
