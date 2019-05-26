/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeExerciciosII;

/**
 *
 * @author ariel
 */
public class Lampada {

    //Atributos
    float potencia;
    boolean estado;

    //Métodos
    void ligar() {
        if (estado == true) {
            System.out.println("Está ligada");
        } else {
            System.out.println("Não funciona");
        }
    }

    void desligar() {
        if (estado == false) {
            System.out.println("Está desligada");
        } else {
            System.out.println("Não funciona");
        }
    }
    //Métodos Especias

    Lampada() {
        this.estado = false;
        this.potencia = 15.0f;
    }

}
