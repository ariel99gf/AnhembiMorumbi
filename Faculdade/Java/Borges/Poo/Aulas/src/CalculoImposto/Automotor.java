package CalculoImposto;

import java.util.Calendar;

public abstract class Automotor {

    int anoFabricacao;
    String modelo;
    String marca;
    double valorMercado;
    String placa;
    String mensagem;
    int ano = Calendar.getInstance().get(Calendar.YEAR);

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    /*public Automotor(int anoFabricacao, String modelo, String marca, double valorMercado, String placa) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.valorMercado = valorMercado;
        this.placa = placa;
    }*/
    public abstract double calcularImposto();

    public String imprimir(String mensagem) {
        return mensagem;

    }
}
