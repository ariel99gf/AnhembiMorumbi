/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author ariel
 */
public class Aula02ex04 {

    public static void main(String[] args) {
        calcularFatorial(5);
    }

    public static void calcularFatorial(int valor) {
        int fat = 1;
        for (int i = 1; i <= valor; i++) {
            fat = fat * i;
            System.out.println("O fatorial é: " + fat);
        }
    }
}
