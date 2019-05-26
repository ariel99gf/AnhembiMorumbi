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
public class Aula02ex02 {
    public static void main(String[] args) {
        boolean t = isPar(3);
        System.out.println(t);
    }
    static boolean isPar(int num){
        if((num % 2)==0){
            return true;
        } else {
            return false;
        }          
    }
}
