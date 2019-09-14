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
public class NumExe02MenorEMaiorNum {

    static void maioroumenor(int a, int b, int c) {
        int menor=0;
        if ((a < b) && (a < c)) {
            menor = a;
        } else if ((b < a) && (b < c)) {
            menor = b;
        } else if ((c < a) && (c < b)) {
            menor = c;
        }

        System.out.println(" Menor:" + menor);
    }

    public static void main(String[] args) {
        maioroumenor(5, 2, 7);
    }
}
