/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.labs;

/**
 *
 * @author ariel
 */
public class Exe02 {
    public static void main(String[] args) {
        Livro odc = new Livro();
        odc.nome = "O Jardim Das Aflições";
        odc.autor = "Olavo De Carvalho";
        odc.editora = "Vide Editorial";
        odc.paginas = 464;
        odc.ano = 2015;
        
        System.out.println(odc.nome);
        System.out.println(odc.paginas);
    }
}
