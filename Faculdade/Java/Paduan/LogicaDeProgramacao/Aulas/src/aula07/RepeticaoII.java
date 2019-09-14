/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class RepeticaoII {

    public static void main(String[] args) {
        int i = 0;
        Scanner idade = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);

        while (i<=3) {

            System.out.println("Digite a altura");
            int k = altura.nextInt();
            System.out.println("Digite a idade: ");
            int j = idade.nextInt();
            if(j <50){
                int cal =0;
                cal=cal+j;
            }
            i--;
        }
    }
}
