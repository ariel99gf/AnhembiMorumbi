/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoImposto;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class GerenciarAutomotores {

    Carro carro = new Carro();
    Moto moto = new Moto();
    Picape picape = new Picape();
    ArrayList<Automotor> lista = new ArrayList<>();

    public void insereDados() {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "========= SEJA BEM VINDO ========="
                + "\n\nPara realização do cadastro, digite a"
                + "\nopção referente ao tipo do seu veículo:"
                + "\n\n1 - Carro"
                + "\n2 - Moto"
                + "\n3 - Picape"
                + "\n"
                + "\n"));
        switch (opcao) {
            case 1:
                carro.anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação do veículo: "));
                carro.modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo: ");
                carro.marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo: ");
                carro.valorMercado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de mercado do veículo: "));
                carro.placa = JOptionPane.showInputDialog(null, "Digite a placa do veículo: ");
                carro.tipoCombustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção referente ao combustível do veículo: "
                        + "\n1 - Álcool"
                        + "\n2 - Gasolina"
                        + "\n3 - Flex"
                        + "\n4 - GNV"
                        + "\n5 - Diesel"));
                adicionar(carro);
                carro.imprimir();
                break;
            case 2:
                moto.anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação do veículo: "));
                moto.modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo: ");
                moto.marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo: ");
                moto.valorMercado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de mercado do veículo: "));
                moto.placa = JOptionPane.showInputDialog(null, "Digite a placa do veículo: ");
                adicionar(moto);
                moto.imprimir();
                break;
            case 3:
                picape.anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação: "));
                picape.modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo: ");
                picape.marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo: ");
                picape.valorMercado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de mercado: "));
                picape.placa = JOptionPane.showInputDialog(null, "Digite a placa do veículo: ");
                picape.tipoCabine = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção referente ao tipo de cabine: "
                        + "\n1 - Simples"
                        + "\n2 - Dupla"));
                adicionar(picape);
                picape.imprimir();
                break;
            case 4:
                listarCarros();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                insereDados();
                break;
        }
    }

    public void adicionar(Automotor a) {
        lista.add(a);
    }

    public boolean remover(String placa) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPlaca().contains(placa)) {
                lista.remove(placa);
                JOptionPane.showMessageDialog(null, "Veículo removido!");
            } else {
                JOptionPane.showMessageDialog(null, "Não encontrada");
            }
        }
        return true;
    }

    public Automotor buscarPorPlaca(String placa) {
        Automotor at = lista.stream().filter(p -> p.placa.equals(placa)).findFirst().orElse(null);
        if (!Objects.isNull(at)) {
            System.out.println("Placa já informada!");
            return at;
        } else {
            System.out.println("Não encontrada");
            return null;
        }
    }

    String listaCarros = "";

    public String listarCarros() {

        lista.stream().filter((at) -> (at instanceof Carro)).forEachOrdered((at) -> {
            listaCarros += ((Carro) at).modelo;
        });
        JOptionPane.showMessageDialog(null, "Lista de carros\n\n"+listaCarros);
        listaCarros = "";
        return "";
    }

    String listaMotos = "";

    public String listarMotos() {
        lista.stream().filter((at) -> (at instanceof Moto)).forEachOrdered((at) -> {
            listaMotos += ((Moto) at).modelo;
        });
        JOptionPane.showMessageDialog(null, "Lista de motos\n\n"+listaMotos);
        listaMotos = "";
        return "";
    }

    String listaPicapes = "";

    public String listarPicapes() {
        lista.stream().filter((at) -> (at instanceof Picape)).forEachOrdered((at) -> {
            listaPicapes += ((Picape) at).modelo;
        });
        JOptionPane.showMessageDialog(null, "Lista de picapes\n\n"+listaPicapes);
        listaPicapes = "";
        return "";
    }

    public double obterValorImposto(String placa) {
          for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPlaca().contains(placa)) {
                JOptionPane.showMessageDialog(null, carro.calcularImposto());
            } else {
                JOptionPane.showMessageDialog(null, "Veículo não encontrado");
            }
        }
        return -1;
    }

    public String listarCarrosPorCombustivel(int tipoCombustivel) {

        lista.stream().filter((at) -> (at instanceof Carro)).forEachOrdered((at) -> {
            System.out.println(((Carro) at).modelo);
        });

        return "";
    }

}
