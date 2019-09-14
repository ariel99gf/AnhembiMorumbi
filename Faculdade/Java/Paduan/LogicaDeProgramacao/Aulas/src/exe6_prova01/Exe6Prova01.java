/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_prova01;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Exe6Prova01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, mediaTurma1 = 0, mediaTurma2 = 0;
        int qtdeAlunosT1, qtdeAlunosT2;

        //ler as notas dos alunos da turma 1
        //calcular a mÃ©dia da turma
        System.out.println("Qtos alunos na turma 1?");
        qtdeAlunosT1 = in.nextInt();
        for (int i = 0; i < qtdeAlunosT1; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ":");
            nota = in.nextFloat();
            mediaTurma1 = mediaTurma1 + nota;
        }
        mediaTurma1 = mediaTurma1 / qtdeAlunosT1;

        //ler as notas dos alunos da turma 2
        //calcular a mÃ©dia da turma
        System.out.println("Qtos alunos na turma 2?");
        qtdeAlunosT2 = in.nextInt();
        for (int i = 0; i < qtdeAlunosT2; i++) {
            System.out.println("Nota do aluno " + (i + 1) + ":");
            nota = in.nextFloat();
            mediaTurma2 = mediaTurma2 + nota;
        }
        mediaTurma2 = mediaTurma2 / qtdeAlunosT2;
        //compara as duas mÃ©dias

        if (mediaTurma1 > mediaTurma2) {
            System.out.println("Turma 1 teve a maior mÃ©dia");
        } else {
            if (mediaTurma1 < mediaTurma2) {
                System.out.println("Turma 2 teve a maior mÃ©dia");
            } else {
                System.out.println("A mÃ©dia das 2 turmas e igual");
            }
        }
    }
}
