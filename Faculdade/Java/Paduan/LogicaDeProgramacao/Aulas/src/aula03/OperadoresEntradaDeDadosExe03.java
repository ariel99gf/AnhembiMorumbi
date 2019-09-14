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
public class OperadoresEntradaDeDadosExe03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sal, aumento, cal;
        System.out.println("Digite o salário");
        sal = input.nextInt();
        cal = (sal) * 1.25f;
        System.out.println("O salário é " + cal);
    }
}
