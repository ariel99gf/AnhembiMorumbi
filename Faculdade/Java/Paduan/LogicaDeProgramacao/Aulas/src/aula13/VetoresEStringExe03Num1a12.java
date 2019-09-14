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
public class VetoresEStringExe03Num1a12 {
    static int Num1a12(int num){
        String []mes;
        for(int i:mes){
        mes[i]={"Jan","Fev","Mar","Abr","mai","Jun","Jul","Ago",
        "Set","Oct","Nov","Dez"};
        }
        if(num>=0||num<=11){
            System.out.println("valido");
        } else{
            System.out.println("Invalido");
        }
        return mes.length;
    }
    public static void main(String[] args) {
        int sm = Num1a12(5);
    }
}
