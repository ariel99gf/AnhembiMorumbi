/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Aula03 {

    public static void main(String[] args) {
        //lerVetor();
    }
    

    public void lerVetor(int[] v) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o valor: ");
            int num=input.nextInt();
            System.out.println(v[i]);
        }
    }
    public int somarNumeros(int [] v){
        
       return 0; 
    }
}
