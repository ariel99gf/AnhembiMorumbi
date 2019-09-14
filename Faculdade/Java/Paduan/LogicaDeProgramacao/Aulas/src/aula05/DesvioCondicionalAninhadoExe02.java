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
public class DesvioCondicionalAninhadoExe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, opcao;

        System.out.println("Digite a opção 1: ");
        a = input.nextInt();
        System.out.println("Digite a opção 2: ");
        b = input.nextInt();
        System.out.println("Digite a opção 3: ");
        c = input.nextInt();

        if (a > b + c) {
            System.out.println("não formam um triângulo");
        } else if (a == b && b == c && c == a) {
            System.out.println("Triângulo equilátero");
        } else if (a == b || a == c) {
            System.out.println("Triângulo Isôsceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
