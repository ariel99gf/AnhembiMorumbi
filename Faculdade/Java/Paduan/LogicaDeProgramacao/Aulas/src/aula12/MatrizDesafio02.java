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
public class MatrizDesafio02 {

    public static void mostraTabuleiro(String[][] x) {
        System.out.println(); //Pular linha
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.println(x[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    private String[][] tabuleiro;

    public void comecaJogo() {
        String[][] tabuleiro = new String[3][3];
        int linha = 0, coluna = 0, valid = 0, jogadas = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = "-";
            }
        }
        //Entrando com os dados de linha e coluna	
        System.out.printf("Digite a linha: ");
        linha = teclado.nextInt();
        System.out.printf("Digite a coluna: ");
        coluna = teclado.nextInt();

//Verificando se a posição do tabuleiro é igual a "-"	
        if (tabuleiro[linha][coluna].equals("-")) {
            tabuleiro[linha][coluna] = "X";
            mostraTabuleiro(this.tabuleiro);
        }
    }
}
