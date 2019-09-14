/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.APS.DilemaDoPrisioneiro;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DilemaDoPrisioneiroTeste01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Irá cooperar ou trair?");
        System.out.println("[1] Trair");
        System.out.println("[2] Cooperar");
                
        

    

    public Integer modoAleatorio() {
        return (int) (1 + Math.random() * 2);

    

    

    

    public String retornaNome(Integer opcao) {
        switch (opcao) {
            case 1:
                return "TRAIR";
            case 2:
                return "COOPERAR";
            case 3:
                return "NAO_ITERADO";
            case 4:
                return "OLHO_POR_OLHO";
            case 5:
                return "OLHO_POR_DOIS_OLHOS";
            case 6:
                return "PROVADOR_INGENUO";
            case 7:
                return "RETALIADOR_PERMANENTE";
            default:
                return "OPCAO_INVALIDA";
        }
    }

    public Integer modoAleatorio() {
        return (int) (1 + Math.random() * 2);
    }
}
}
}
