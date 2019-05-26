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
public class NumExe04ParOuNao {
    static boolean ParOuNao(int a){
        if(a%2==0){
            return true;
        } else 
           return false; 
    }
    public static void main(String[] args) {
        System.out.println(ParOuNao(6));
    }
    
}
