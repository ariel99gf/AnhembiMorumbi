/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoImposto;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Picape extends Automotor {

    int tipoCabine;

    public Picape() {
    }

    public Picape(int anoFabricacao, String modelo, String marca, 
            double valorMercado, String placa, int tipoCabine){
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.valorMercado = valorMercado;
        this.placa = placa;
        this.tipoCabine = tipoCabine;
    }
    
    @Override
    public double calcularImposto() {
        double imposto = 0;

        if (ano - anoFabricacao < 20) {
            if (tipoCabine == 1) {
                imposto = valorMercado * 0.02;
            } else {
                imposto = valorMercado * 0.04;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Picapes com mais de 20 anos de idade são isentos de impostos!");
        }

        return imposto;
    }

    public String imprimir() {
        double imp = calcularImposto();
        mensagem = "========= VEÍCULO DO TIPO PICAPE CADASTRADO COM SUCESSO ========="
                 + "\n\n---------------------- DADOS CADASTRADOS ----------------------"
                + "\n\nAno de Fabricação: " + this.anoFabricacao 
                + "\nModelo: " + this.modelo 
                + "\nMarca: " + this.marca 
                + "\nValor de mercado: " + this.valorMercado 
                + "\nPlaca: " + this.placa 
                + "\nTipo de cabine: " + (this.tipoCabine==1?"Simples":"Dupla") 
                + "\nValor do imposto: R$" + imp;

        JOptionPane.showMessageDialog(null, mensagem);

        return mensagem;
    }

}
