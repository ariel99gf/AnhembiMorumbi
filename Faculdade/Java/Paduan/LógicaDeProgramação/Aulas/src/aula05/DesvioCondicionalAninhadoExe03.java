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
public class DesvioCondicionalAninhadoExe03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, num2, r, o;

        System.out.println("Digite o 1 número: ");
        num = input.nextInt();
        System.out.println("Digite o 2 número");
        num2 = input.nextInt();
        System.out.println("Entre com as opções abaixo: ");
        System.out.println("1-soma");
        System.out.println("2-subtração");
        System.out.println("3-multiplicação");
        System.out.println("4-divisão");
        System.out.println("5-sair");
        System.out.println("-.-.-.-.-.-");
        o = input.nextInt();

        switch (o) {
            case 1:
                r = num + num2;
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                System.out.println("O resultado é " + r);
                break;
            case 2:
                r = num - num2;
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                System.out.println("O resultado é " + r);
                break;
            case 3:
                r = num * num2;
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                System.out.println("O resultado é " + r);
                break;
            case 4:
                r = num / num2;
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                System.out.println("O resultado é " + r);
                break;
            case 5:
                r = 0;
                System.out.println("Opção inválida");
                break;
        }
    }
}
