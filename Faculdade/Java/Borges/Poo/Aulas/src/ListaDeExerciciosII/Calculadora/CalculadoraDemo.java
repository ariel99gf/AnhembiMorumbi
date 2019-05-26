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
public class CalculadoraDemo {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        System.out.println("A soma é: " + cal.somar(4,2));
        System.out.println("A subtração é: " + cal.subtrair(2,1));
        System.out.println("A multiplicação é: " + cal.multiplicar(3,2));
        System.out.println("A divisão é: " + cal.dividir(8,2));
        
    }
}
