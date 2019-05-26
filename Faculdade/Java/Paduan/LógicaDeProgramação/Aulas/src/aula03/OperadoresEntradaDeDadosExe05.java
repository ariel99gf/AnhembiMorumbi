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
public class OperadoresEntradaDeDadosExe05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float altura, base, area;

        System.out.println("Digite a altura");
        altura = input.nextInt();
        System.out.println("Digite a base");
        base = input.nextInt();
        area = (altura * base) / 2;
        System.out.println("A área é " + area);
    }
}
