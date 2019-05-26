/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoImposto;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Moto extends Automotor {

    @Override
    public double calcularImposto() {
        double imposto = 0;

        if (ano - anoFabricacao < 20) {

            imposto = valorMercado * 0.02;

        } else {
            JOptionPane.showMessageDialog(null, "Motos com mais de 20 anos de idade são isentos de impostos!");
        }

        return imposto;
    }

    public String imprimir() {
        double imp = calcularImposto();
        mensagem =  "========= VEÍCULO DO TIPO MOTO CADASTRADO COM SUCESSO ========="
                 + "\n\n---------------------- DADOS CADASTRADOS ----------------------"
                + "\n\nAno de Fabricação: " + this.anoFabricacao 
                + "\nModelo: " + this.modelo 
                + "\nMarca: " + this.marca
                + "\nValor de mercado: " + this.valorMercado 
                + "\nPlaca: " + this.placa 
                + "\nValor do imposto: R$" + imp;

        JOptionPane.showMessageDialog(null, mensagem);

        return mensagem;
    }

}
