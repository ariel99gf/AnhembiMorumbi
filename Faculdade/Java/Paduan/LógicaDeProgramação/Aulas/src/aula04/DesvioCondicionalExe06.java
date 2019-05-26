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
public class DesvioCondicionalExe06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sal, prest, cal;

        System.out.println("Digite o salário: ");
        sal = input.nextInt();
        System.out.println("Digite o emprestimo");
        prest = input.nextInt();

        if (prest <= (sal * 0.30)) {
            System.out.println("Pode emprestar");
        } else {
            System.out.println("não pode emprestar");
        }
    }
}
