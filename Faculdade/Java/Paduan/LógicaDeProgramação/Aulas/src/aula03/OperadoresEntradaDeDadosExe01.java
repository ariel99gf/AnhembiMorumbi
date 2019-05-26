/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class OperadoresEntradaDeDadosExe01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num2, num3, cal;
        System.out.println("Digite o 1 número");
        num = input.nextInt();
        System.out.println("Digite o 2 número");
        num2 = input.nextInt();
        System.out.println("Digite o 3 número");
        num3 = input.nextInt();

        cal = num + num2 + num3;
        System.out.println("Resultado= " + cal);
    }
}
