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
public class Aula03Ex02 {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.valGpu = 3;
        pc.valCpu = 5;
        pc.valRam = 4;
        pc.qualCpu = "intel i7200U";
        pc.qualGpu = "940mx";
        pc.qualRam = "Kingston";
        pc.status();
        pc.bomRuim();
    }
}
