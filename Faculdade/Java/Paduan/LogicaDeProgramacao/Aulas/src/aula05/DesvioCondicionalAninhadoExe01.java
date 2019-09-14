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
public class DesvioCondicionalAninhadoExe01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.println("Digite o valor: ");
        valor = input.nextInt();

        if (valor <= 600) {
            System.out.println("Isento");
        } else if (valor > 600 && valor <= 1200) {
            System.out.println("20%");
        } else if (valor > 1200 && valor <= 2000) {
            System.out.println("25%");
        } else if (valor > 2000) {
            System.out.println("30%");
        }
    }
}
