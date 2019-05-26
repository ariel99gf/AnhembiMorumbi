/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class PréProvaN1 {

    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        int cont = 0, nota, media, acmnota = 0;
        while (cont < 5) {
            System.out.println("Digite a nota: ");
            nota = Leitura.nextInt();
            acmnota = acmnota + nota;
            cont++;
        }
        media = acmnota / 5;
        System.out.println("A media e:" + media);
    }
}
