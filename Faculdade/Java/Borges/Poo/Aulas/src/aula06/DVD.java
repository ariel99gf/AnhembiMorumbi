/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author prof208
 */
public class DVD {
    
    String titulo;
    String genero;
    double duracao;
    String produtora;
    String diretor;
    int classIdade;
    
    public void set(String titulo, String genero, double duracao, String produtora, String diretor, int classIdade){  
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.produtora = produtora;
        this.diretor = diretor;
        this.classIdade = classIdade;
    }
    
    private DVD get (){
        return this;
    }
    
  
    public void impressao(){
        System.out.println(this.titulo+" - "+this.genero+" - "+this.classIdade);
        System.out.println(this.produtora+" - "+this.diretor+" - "+this.duracao);
    }
    
    
    
}
