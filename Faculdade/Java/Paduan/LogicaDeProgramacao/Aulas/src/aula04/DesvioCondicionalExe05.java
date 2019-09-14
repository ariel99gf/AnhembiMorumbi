/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DesvioCondicionalExe05 {

    public static void main(String[] args) {
        String a = "R10p5";
        String senha;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        if (senha.equals(a)) {
            System.out.println("Parabéns");
        } else {
            System.out.println("Digitou errado");
        }
    }
}
