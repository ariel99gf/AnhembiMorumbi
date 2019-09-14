/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class CursoEmVideoCursoDeJava12Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  int cc=0;
      
     do{
         System.out.println("ccambalhota");
         cc++;
     }while(cc<4);
         */
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite o numero");
            n=teclado.nextInt();
            s+=n;
            System.out.println("Quer continuar? [ S/n]");
            resp=teclado.next();
        }while(resp.equals("s"));
        System.out.println("a some de todos os valor é "+s);
    }

}
