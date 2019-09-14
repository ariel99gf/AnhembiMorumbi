/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula03;

/**
 *
 * @author ariel
 */
public class Computador {

    String qualCpu;
    String qualRam;
    String qualGpu;
    int valCpu;
    int valRam;
    int valGpu;
    public void status() {
        System.out.println("A cpu é: "+ this.qualCpu);
        System.out.println("A ram é: " + this.qualRam);
        System.out.println("A gpu é: " + this.qualGpu);
        System.out.println("O valor é: " + this.valCpu);
        System.out.println("O valor é: " + this.valGpu);
        System.out.println("O valor é: " + this.valRam);
    }

    public void bomRuim() {
        if (this.valCpu + this.valRam + this.valGpu /3 >= 10) {
            System.out.println("Bom");
        } else if (this.valRam + this.valCpu + this.valGpu /3 < 10) {
            System.out.println("Ruim");
        } 
    }
}
