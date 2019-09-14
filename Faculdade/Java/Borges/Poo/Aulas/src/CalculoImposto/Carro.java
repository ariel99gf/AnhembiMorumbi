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
public class Carro extends Automotor {

    int tipoCombustivel;

    public Carro() {
    }

    public Carro(int anoFabricacao, String modelo, String marca, double valorMercado, String placa, int tipoCombustivel){
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.valorMercado = valorMercado;
        this.placa = placa;
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public double calcularImposto() {

        double imposto = 0;
        
        if (super.ano - super.anoFabricacao < 20) {
            if (tipoCombustivel == 2 || tipoCombustivel == 3 || tipoCombustivel == 5) {
                imposto = valorMercado * 0.04;
            } else {
                imposto = valorMercado * 0.03;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Carros com mais de 20 anos de idade são isentos de impostos!");
        }

        return imposto;
    }
    
    public String imprimir() {
        double imp = calcularImposto();
        mensagem = "========= VEÍCULO DO TIPO CARRO CADASTRADO COM SUCESSO ========="
                + "\n\n---------------------- DADOS CADASTRADOS ----------------------"
                + "\n\nAno de Fabricação: " + this.anoFabricacao 
                + "\nModelo: " + this.modelo 
                + "\nMarca: " + this.marca 
                + "\nValor de mercado: " + this.valorMercado 
                + "\nPlaca: " + this.placa 
                + "\nTipo de Combustível: " + (this.tipoCombustivel==1?"Álcool":
                (this.tipoCombustivel==2?"Gasolina":(this.tipoCombustivel==3?"Flex":
                (this.tipoCombustivel==3?"Flex":(this.tipoCombustivel==4?"GNV":"Diesel"))))) 
                + "\nValor do imposto: R$" + imp;

       JOptionPane.showMessageDialog(null, mensagem);

        return mensagem;
    }

}
