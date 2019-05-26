/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author ariel
 */
public class Carro {

    String nome;
    String marca;
    String cor;
    boolean BancoCouro;
    boolean transmissao;
    String modelo;
    String placa;
    int potencia;
    double gastoGasolina;
    double tanque;

    void set(Carro obj, String nome, String marca, String cor, boolean BancoCouro, boolean transmissao, String modelo,
            String placa, int potencia, double gastoGasolina) {
        obj.nome = nome;
        obj.marca = marca;
        obj.cor = cor;
        obj.BancoCouro = BancoCouro;
        obj.transmissao = transmissao;
        obj.modelo = modelo;
        obj.placa = placa;
        obj.potencia = potencia;
        obj.gastoGasolina = gastoGasolina;
        obj.tanque = 0;
    }

    static void get(Carro obj) {
        System.out.println("Marca:" + obj.marca + ", Modelo:" + obj.nome + ", Placa:" + obj.placa);
        System.out.println("Automatico:" + obj.transmissao + ", Potencia:" + obj.potencia + ", Km/Litro:" + obj.gastoGasolina);
    }

    static void darPartida(Carro obj) {
        if (obj.nome.equals("Ferrari")) {
            System.out.println("zuuuuuuuuuuuuuuuuuuuuummmmmmmmmm");
        } else if (obj.nome.equals("hb20") || obj.nome.equals("Kombi")) {
            System.out.println("ticaracatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        } else if (obj.nome.equals("HRV")) {
            System.out.println("bruuuuuuuuuuuuuuuuuuuuummmmmmmmmmmm");
        }
    }

    static double time100km(Carro obj) {
        if (obj.nome.equals("Ferrari")) {
            return 6.15;
        } else if (obj.nome.equals("hb20") || obj.nome.equals("Kombi")) {
            return 11.8;
        } else if (obj.nome.equals("HRV")) {
            return 11.7;
        }
        return 0;
    }

    static void abastecerCarro(Carro car, double litros) {
        car.tanque += litros;
    }

    static void andarCarro(Carro car, double km) {
        car.tanque -= km / car.gastoGasolina;
    }

    public static void main(String[] args) {
        Carro ferrari = new Carro(); //criando os objetos do tipo carro
        Carro hb20 = new Carro();
        Carro hrv = new Carro();
//atribuindo valores para cada objeto, atributos
        ferrari.set(ferrari, "Ferrari", "Ferrari", "Vermelho", true, true, "Spider", "EES4578", 400, 16);
        hb20.set(hb20, "hb20", "Hyundai", "Preto", true, true, "Sedan", "YOU4557", 295, 13);
        hrv.set(hrv, "HRV", "Honda", "Rosa", false, false, "Hatch", "ZCS7777", 180, 7);
        // Carro.get(hb20);
        //Carro.darPartida(hb20);
        // System.out.println(Carro.time100km(hb20)+" s/km");

        Carro kombi = new Carro();
        kombi.set(kombi, "Kombi", "Volkswagen", "Branca", false, false, "1960", "XIS1234", 125, 8);
        Carro.get(kombi);
        Carro.darPartida(kombi);
        Carro.abastecerCarro(kombi, 7.23);
        Carro.abastecerCarro(kombi, 18.23);
        System.out.println(kombi.tanque);
        Carro.andarCarro(kombi, 12.3);
        System.out.println(kombi.tanque);

    }
}
