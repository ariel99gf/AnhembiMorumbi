/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula06;

/**
 *
 * @author ariel
 */
public interface Controlador {
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosvolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
