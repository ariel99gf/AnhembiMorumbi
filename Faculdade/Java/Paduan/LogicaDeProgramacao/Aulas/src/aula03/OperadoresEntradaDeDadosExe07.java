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
public class OperadoresEntradaDeDadosExe07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, cal, cal2, cal3, cal4;
        System.out.println("Digite o número");
        num = input.nextInt();
        cal = Math.pow(num, 4);
        System.out.println("O valor ao quadrado é " + cal);
        cal2 = Math.pow(num, 2);
        System.out.println("O valor ao cubo é " + cal2);
        cal3 = num + Math.sqrt(2);
        System.out.println("O valor da raiz é " + cal3);
        cal4 = Math.pow(num, 10);
        System.out.println("O valor na potência 10 é " + cal4);
    }
}
