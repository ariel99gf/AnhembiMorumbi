/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author ariel
 */
public class VetoresEStringExe01VocaisErrado {

    public static void contador(String[] palavras,String frase) {
        
    }

    public static void main(String[] args) {
        String frase = "Era uma vez, um programador";
        String[]palavras = frase.split(" "); 
        System.out.println(palavras.length);
        
    }
}
