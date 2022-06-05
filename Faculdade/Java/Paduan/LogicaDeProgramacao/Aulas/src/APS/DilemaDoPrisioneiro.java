/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APS;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class DilemaDoPrisioneiro {

  public static void main(String[] args) {
    Scanner estrategia = new Scanner(System.in);
    boolean continuarJogo = true;
    boolean continuarEstrategia = true;
    boolean continuarModo_Jogo = true;
    char opcaoRegra;
    int modoEstrategia = 0, modoTrair_Cooperar = 0, comparsa = 0;

    // APRESENTAÇÃO DO JOGO
    String verApresentacao = "\n[EXPLICAÇÃO]\nDois suspeitos de terem cometido um crime grave são presos e interrogados\n"
        + "separadamente. Na tentativa de incriminá-los, o inspetor, secretamente oferece a cada um a\n"
        + "opção de entregar o comparsa e ficar livre (TRAIR) ou ficar calado (COOPERAR), considerando que\n"
        + "- Trair: Significa realizar uma ação onde se busca o maior ganho próprio em prejuízo do\n"
        + "outro, que ganha a penalidade.\n\n"
        + "- Cooperar: Significa realizar uma ação mediadora que busque trazer compartilhamento\n"
        + "de custos e benefícios em uma interação.\n\n"
        + "Caso um dos suspeitos denuncie o outro, e este fique calado, o denunciante obtém a\n"
        + "liberdade, enquanto o outro arcaria sozinho com a pena máxima (10 anos de prisão). Se ambos\n"
        + "permanecem em silêncio, são ambos penalizados, mas pagando com uma pena branda (2 anos\n"
        + "de prisão). Mas se os dois se denunciam um ao outro, são punidos com a mesma penalidade\n"
        + "(5 anos de prisão): menor do que a máxima, mas maior do que a pena branda.\n";

    // SELAÇÃO ESTRATÉGIA
    String verEstrategia = "[ESTRATÉGIA]\nSabendo como o jogo funciona, por gentileza, escolha qual a "
        + "estratégia você utilizará.\nLembre-se que as opções são:\n3- Não Iterado (simples);\n4- Olho por olho;\n5- Olho por dois olhos;\n"
        + "6- Provador Ingênuo;\n7- Retaliador Permanente."
        + "\nObs.: Se quiser sair, digite '0'."
        + "\nDigite o número que represente sua opção: ";

    // VER REGRAS OU NÃO
    String verRegras = "Bem-vindo(a) ao jogo do 'DILEMA DO PRISIONEIRO'.\n"
        + "Você já o conhece?\n*Digite 's' caso conheça e 'n' caso contrário para conhecê-lo. Se quiser sair, digite 'x'.\nR: ";

    while (continuarJogo) {
      System.out.print(verRegras);
      opcaoRegra = estrategia.next().charAt(0);

      if (opcaoRegra == 's' || opcaoRegra == 'S') {
        System.out.print(verEstrategia);
        modoEstrategia = estrategia.nextInt();
        continuarJogo = false;
      } else if (opcaoRegra == 'n') {
        System.out.println(verApresentacao);
        System.out.print(verEstrategia);
        modoEstrategia = estrategia.nextInt();
        continuarJogo = false;
      } else if (opcaoRegra == 'x' || opcaoRegra == 'X') {
        continuarJogo = false;
        continuarEstrategia = false;
        continuarModo_Jogo = false;
        System.out.println("Jogo encerrado.");
        System.exit(0);
      } else {
        System.out.println("\nOpção inválida. Tente novamente!\n");
      }
      ;
    }

    // ESCOLHER TIPO DE ESTRATÉGIA
    while (continuarEstrategia) {
      if (modoEstrategia == 3 || modoEstrategia == 4 || modoEstrategia == 5 || modoEstrategia == 6
          || modoEstrategia == 7) {
        System.out.print("\nVejo que você escolheu a estratégia " + modoEstrategia + ", certo?\n"// DAR NOME AO TIPO DE
                                                                                                 // ESTRATÉGIA.
            + "Agora que escolheu sua estratégia, preciso saber... você prefere trair (seu parceiro) ou cooperar (com a investigação)?\n"
            + "Para trair (seu parceiro) digite '1', para cooperar digite '2'. Se quiser sair, digite '0'.\nR: ");
        modoTrair_Cooperar = estrategia.nextInt();
        continuarEstrategia = false;
      } else if (modoEstrategia == 0) {
        continuarEstrategia = false;
        System.out.println("\nJogo encerradsso.");
        System.exit(0);
      } else {
        System.out.println("\nOpção inválida. Tente novamente!\n");
        return;
      }
      ;
    }

    // ESCOLHER TRAIR OU COOPERAR
    while (continuarModo_Jogo) {
      if (modoTrair_Cooperar == 1 || modoTrair_Cooperar == 2) {
        System.out.print("\nVejo que você irá usar o modo '" + modoTrair_Cooperar + "'...\nVamos lá!\n");
        continuarModo_Jogo = false;
      } else if (modoTrair_Cooperar == 0) {
        continuarModo_Jogo = false;
        System.out.println("\nJogo encerrado.");
        System.exit(0);
      } else {
        System.out.println("\nOpção inválida. Tente novamente!\n");
        return;
      }
      ;
    }

    // JOGO EM SÍ
    while (modoEstrategia == 3) {// 3- Não Iterado (simples);
      if (modoTrair_Cooperar == 1) {
        comparsa = (int) (1 + Math.random() * 2);
        System.out
            .println("Você escolheu '" + modoTrair_Cooperar + "' (trair). Seu parceiro decidiu " + comparsa + ".");
        return;
      }
      if (modoTrair_Cooperar == 2) {
        comparsa = (int) (1 + Math.random() * 2);
        System.out
            .println("Você escolheu '" + modoTrair_Cooperar + "' (cooperar). Seu parceiro decidiu " + comparsa + ".");
        return;
      } else if (modoTrair_Cooperar >= 1 || comparsa <= 2) {
        System.out.print("Deseja continuar?");
        opcaoRegra = estrategia.next().charAt(0);

        if (opcaoRegra == 's' || opcaoRegra == 'S') {
          System.out.print(verEstrategia);
          modoEstrategia = estrategia.nextInt();
          continuarJogo = false;
        } else if (opcaoRegra == 'n') {
          System.out.println(verApresentacao);
          System.out.print(verEstrategia);
          modoEstrategia = estrategia.nextInt();
          continuarJogo = false;
        } else if (opcaoRegra == 'x' || opcaoRegra == 'X') {
          continuarJogo = false;
          continuarEstrategia = false;
          continuarModo_Jogo = false;
          System.out.println("Jogo encerrado.");
          System.exit(0);
        } else {
          System.out.println("\nOpção inválida. Tente novamente!\n");
        }
        ;

      }
    }

    while (modoEstrategia == 4) {// Olho por olho/
      if (modoTrair_Cooperar == 1) {

        System.out.println("N existe" + comparsa);
      }

    }
  }
}
