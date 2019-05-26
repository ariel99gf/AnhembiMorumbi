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
public class NumExe01AreaCirculo {

    static void calcular(double raio,double area){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio");
        raio = input.nextDouble();
        area = raio * area;
        System.out.println("Area "+area);
    }

    public static void main(String[] args) {
        calcular(2,Math.PI);
    }
}
