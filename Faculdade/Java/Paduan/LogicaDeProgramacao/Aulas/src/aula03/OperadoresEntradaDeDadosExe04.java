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
public class OperadoresEntradaDeDadosExe04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano, cal;
        System.out.println("Digite o ano");
        ano = input.nextInt();

        cal = (ano) - 2018;
        System.out.println("Sua idade é " + cal);
    }
}
