package teste.APS.DilemaDoPrisioneiro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DilemaDoPrisioneiro {

    public static void main(String[] args) {
        DilemaDoPrisioneiro dilemaPrisioneiro = new DilemaDoPrisioneiro();
        Scanner scanner = new Scanner(System.in);

        // SELECAO DE ESTRATEGIA
        System.out.println("Qual estratégia você utilizará?");
        System.out.println("[3] Não Iterado");
        System.out.println("[4] Olho por Olho");
        System.out.println("[5] Olho por dois Olhos");
        System.out.println("[6] Provador Ingênuo");
        System.out.println("[7] Retaliador Permanente");

        int opcaoSelecionada = scanner.nextInt();

        if (opcaoSelecionada < 3 || opcaoSelecionada > 7) {
            System.out.println("Opção inválida!");
        }

        dilemaPrisioneiro.usuarioEstrategia = opcaoSelecionada;

        // SELECAO DE MODO
        System.out.println("Irá cooperar ou trair?");
        System.out.println("[1] Trair");
        System.out.println("[2] Cooperar");

        int modoSelecionado = scanner.nextInt();

        if (modoSelecionado < 1 || modoSelecionado > 2) {
            System.out.println("Modo inválido!");
        }

        dilemaPrisioneiro.usuarioModo = modoSelecionado;

        // VERIFICA SE QUER CONTINUAR JOGANDO
        System.out.println("Deseja continuar jogando? 's' ou 'n'");
        String continuar2 = scanner.next();

        if (continuar2 == null || continuar2.equals("n")) {
            System.exit(0);
        } else if (continuar2.equals("s")) {
            System.out.println("Ok. Continuando...");
        }

        System.out.println("JOGADOR: Modo: " + dilemaPrisioneiro.retornaNome(dilemaPrisioneiro.usuarioModo));
        System.out.println("JOGADOR: Estratégia: " + dilemaPrisioneiro.retornaNome(dilemaPrisioneiro.usuarioEstrategia));

        // SE FOR A PRIMEIRA EXECUCACAO, SELECIONA RANDOMICAMENTE O MODO DO COMPARSA, SE NAO 1
        if (dilemaPrisioneiro.PrimeiraExecução) {
            dilemaPrisioneiro.comparsaModo = dilemaPrisioneiro.modoAleatorio();
        } else {
            dilemaPrisioneiro.comparsaModo = 1; //
        }

        System.out.println("COMPARSA: Modo: " + dilemaPrisioneiro.retornaNome(dilemaPrisioneiro.comparsaModo));
    }

    static final Integer NAO_ITERADO = 3;
    static final Integer OLHO_POR_OLHO = 4;
    static final Integer OLHO_POR_DOIS_OLHOS = 5;
    static final Integer PROVADOR_INGENUO = 6;
    static final Integer RETALIADOR_PERMANENTE = 7;

    static final Integer TRAIR = 1;
    static final Integer COOPERAR = 2;

    Integer usuarioModo;
    Integer usuarioEstrategia;

    Integer comparsaModo;
    Integer comparsaEstrategia;

    Boolean primeiraExecucao = true;

    public String retornaNome(Integer opcao) {
        switch (opcao) {
            case 1:
                return "TRAIR";
            case 2:
                return "COOPERAR";
            case 3:
                return "NAO_ITERADO";
            case 4:
                return "OLHO_POR_OLHO";
            case 5:
                return "OLHO_POR_DOIS_OLHOS";
            case 6:
                return "PROVADOR_INGENUO";
            case 7:
                return "RETALIADOR_PERMANENTE";
            default:
                return "OPCAO_INVALIDA";
        }
    }

    public Integer modoAleatorio() {
        return (int) (1 + Math.random() * 2);
    }
}
