/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APS;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DilemaDoPrisioneiroArielFonseca {

    public static void main(String[] args) {
        //Trabalho de Logica
        Scanner input = new Scanner(System.in);
        int retaliadorPermanente = 4, provadorIngênuo = 5, olhoPorOlho = 6, olhoPor2Olhos = 7, nãoIterado = 3;
        int cooperar = 1, trair = 2;
        int comparsa;

        /*

         */
        System.out.println("qual estrategia deseja usar? =" + " ");
        String estrategia = input.nextLine();

        System.out.println("deseja cooperar ou trair");
        String opcao = input.nextLine();

        if (cooperar == 1) {
            System.out.println("você cooperou");

        } else {
            trair = 1;
            System.out.println("você traiu");
        }

    }

}
