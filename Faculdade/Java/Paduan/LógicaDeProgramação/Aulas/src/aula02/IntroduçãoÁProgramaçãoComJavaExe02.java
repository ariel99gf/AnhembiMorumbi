/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class IntroduçãoÁProgramaçãoComJavaExe02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cal = 15 + 7;
        int cal4 = 15 / 7;
        int cal3 = 15 * 7;
        int cal2 = 15 - 7;
        System.out.println("Qual operação deseja [1+] [2-] [3*] [4/]");
        int opção = input.nextInt();
        switch (opção) {
            case 1:
                System.out.println(cal);
                break;
            case 2:
                System.out.println(cal2);
                break;
            case 3:
                System.out.println(cal3);
                break;
            case 4:
                System.out.println(cal4);
                break;
        }
    }
}
