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
public class DesvioCondicionalAninhadoExe05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float falta, nota, media, nota2;

        System.out.println("Digite suas faltas: ");
        falta = input.nextFloat();
        System.out.println("Digite a 1 nota: ");
        nota = input.nextFloat();
        System.out.println("Digite a 2 nota: ");
        nota2 = input.nextFloat();
        media = nota + nota2 / 2;
        if (falta >= 16) {
            System.out.println("reprovado");
        }
        if (nota >= 6 && nota <= 10) {
            System.out.println("Aprovado");
        } else if (nota <5) {
            System.out.println("Você reprovou ");
        }
        if (media >= 5 && media <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("inválido");
        }
    }
}
