/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class NumExe03MultiploOuNao {
    static void ParouNao(int a,int b){
        int cal=0;
        if(cal==b%a){
            System.out.println("è multiplo");
        } else{
            System.out.println("Não é multiplo");
        }
    }
    public static void main(String[] args) {
        ParouNao(5,25);
    }
}
