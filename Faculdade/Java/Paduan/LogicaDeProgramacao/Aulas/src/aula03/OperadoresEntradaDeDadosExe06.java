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
public class OperadoresEntradaDeDadosExe06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sal, quilo, quilo2, cal, cal2, cal3;

        System.out.println("Digite o salário: ");
        sal = input.nextInt();
        System.out.println("Digite o quilowatt");
        quilo = input.nextInt();
        cal = (sal + quilo) / 500;
        System.out.println("O valor de cada quilowatt é " + cal);
        cal2 = sal / quilo;
        System.out.println("O valor a ser pago é R$" + cal2);
        cal3 = (cal2) / 0.5f;
    }

}
