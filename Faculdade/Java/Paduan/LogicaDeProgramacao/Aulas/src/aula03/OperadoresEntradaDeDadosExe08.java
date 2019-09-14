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
public class OperadoresEntradaDeDadosExe08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, cal;
        System.out.println("Digite o KM");
        km = input.nextInt();
        cal = km * 0.62137;
        System.out.println("O valor em milhas é " + cal);
    }
}
