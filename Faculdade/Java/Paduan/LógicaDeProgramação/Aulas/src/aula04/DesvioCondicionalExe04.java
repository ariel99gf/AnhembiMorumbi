/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DesvioCondicionalExe04 {

    public static void main(String[] args) {
        float cal, cal2, altura;
        String sexo, m, f;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura");
        altura = input.nextFloat();
        System.out.println("Digite o sexo [m] para masculino [f] para feminino");
        sexo = input.next();

        if (sexo.equals('m')) {
            cal = (altura * 72.7f) - 58f;
            System.out.println("O peso ideal masculino é " + cal);
        } else if (sexo.equals('f')) {
            cal2 = (altura * 62.1f) - 44.7f;
            System.out.println("O peso ideal feminino é " + cal2);
        }
    }
}
