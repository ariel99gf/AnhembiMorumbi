/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooAula09;

/**
 *
 * @author ariel
 */
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro",22,"M");
        p[1] = new Pessoa("Maria",25,"F");
        
        l[0] = new Livro("Aprendendo Java", "José da silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciates", "Pedro Paulo", 500,p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido", 800,p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
