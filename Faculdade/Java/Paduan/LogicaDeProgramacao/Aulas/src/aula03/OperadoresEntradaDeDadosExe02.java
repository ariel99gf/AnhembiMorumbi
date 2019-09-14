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
public class OperadoresEntradaDeDadosExe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num, num2, media;

        System.out.println("Digite o 1 número");
        num = input.nextInt();
        System.out.println("Digite o 2 número");
        num2 = input.nextInt();
        media = (num + num2) / 2;
        System.out.println("A media é" + media);
    }
}
