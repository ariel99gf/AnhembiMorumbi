/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulado_exe06;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Simulado_exe06 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num, cont, contPositivos;
        int maior = -1;
        int menor = Integer.MAX_VALUE;
        float media = 0;

        //entrada - ler 10 nÃºmeros
        cont = 1;
        contPositivos = 0;
        while (cont < 11) {
            System.out.println("Digite um valor inteiro positivo:");
            num = leitura.nextInt();
            if (num > 0) {
                contPositivos++;
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
                media = media + num;
            }
            cont++;
        }

        //saida
        media = media / contPositivos;
        System.out.println("Media = " + media);
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    }
}
