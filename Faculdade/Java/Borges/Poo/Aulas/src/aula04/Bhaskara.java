/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double delta;
        delta = (b * b) - (4 * a * c);

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {

            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            DecimalFormat df = new DecimalFormat("0.00000");
            System.out.println("R1 = " + df.format(raiz1));
            System.out.println("R2 = " + df.format(raiz2));

        }

    }
}
