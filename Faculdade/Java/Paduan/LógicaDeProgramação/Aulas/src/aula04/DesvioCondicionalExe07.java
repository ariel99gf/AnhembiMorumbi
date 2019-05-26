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
public class DesvioCondicionalExe07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float prod, vel;

        System.out.println("Digite o valor do Produto: ");
        prod = input.nextInt();

        if (prod < 20) {
            vel = prod + (prod * 0.45f);
            System.out.println("Lucro de 45%");
        } else {
            vel = prod + (prod * 0.3f);
            System.out.println("Lucro de 30%");
        }
    }
}
