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
public class Aula02 {
    public static void main(String[] args) {
      int x =encontrarMax(1,5);
        System.out.println("O maior número é: " +x);
      int y = encontrarMin(2,3);
        System.out.println("O menor número é: " +y);
    } 
    static int encontrarMax(int n1,int n2){
       int Maior = Math.max(n1, n2);
        return Maior;
    }
    static int encontrarMin(int n1,int n2){
        int Menor = Math.min(n1, n2);
        return Menor;
    }
}
