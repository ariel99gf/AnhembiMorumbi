/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculoImposto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Principal {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        GerenciarAutomotores gerencia = new GerenciarAutomotores();
        int opcao = 1;
        int opcao2;
        do {
                gerencia.insereDados();
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Deseja cadastrar mais algum veículo?"
                        + "\n\nDigite 1 para sim"
                        + "\nDigite 2 para outras opções"));

            } while (opcao == 1);

                opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Digite o número referente a opção desejada"
                        + "\n1 - Listar Carros"
                        + "\n2 - Listar Motos"
                        + "\n3 - Listar Picapes"
                        + "\n4 - Listar carros por combustível"
                        + "\n5 - Buscar veículo pela placa"
                        + "\n6 - Obter valor do imposto"
                        + "\n7 - Remover veículo"
                        + "\n8 - Encerrar sistema"));
                if (opcao2 == 1) {
                    gerencia.listarCarros();
                } else if (opcao2 == 2) {
                    gerencia.listarMotos();
                } else if (opcao2 == 3) {
                    gerencia.listarPicapes();
                } else if (opcao2 == 4) {
                    int comb = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de 1 a 5: "));
                    gerencia.listarCarrosPorCombustivel(comb);
                } else if (opcao2 == 5) {
                    String pPlaca = JOptionPane.showInputDialog(null, "Digite a placa");
                    gerencia.buscarPorPlaca(pPlaca);
                } else if (opcao2 == 6) {
                    String pPlaca2 = JOptionPane.showInputDialog(null, "Digite a placa");
                    gerencia.obterValorImposto(pPlaca2);
                } else if (opcao2 == 7) {
                    String pPlaca3 = JOptionPane.showInputDialog(null, "Digite a placa");
                    gerencia.remover(pPlaca3);
                } else if (opcao2 == 8) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                }
        }
    }
