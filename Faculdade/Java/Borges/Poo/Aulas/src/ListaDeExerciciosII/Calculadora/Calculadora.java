/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExerciciosII.Calculadora;

/**
 *
 * @author ariel
 */
public class Calculadora {

    double somar(double som, double som2) {
        double rest = som + som2;
        return rest;
    }

    double subtrair(double sub, double sub2) {
        double rest = sub - sub2;
        return rest;
    }

    double multiplicar(double mult, double mult2) {
        double rest = mult * mult2;
        return rest;
    }

    double dividir(double div, double div2) {
        double rest = div / div2;
        if (div2 == 0) {
            System.out.println("Operação não realizada. Favor entrar com um dividor válido");
        }
        return rest;
    }

}
