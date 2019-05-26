/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

/**
 *
 * @author prof208
 */
public class Codigo implements Comparable{
    double preco;
    String marca;
    int qtd;
    String sabor;
    int val_dia;
    int val_mes;
    int val_ano;
    
    
    public int compareTo(Object outro){
       //retorna -1 0 ou 1
        Codigo aux = (Codigo) outro;
        
        if (this.marca.charAt(0) > aux.marca.charAt(0)){
            return 1;
        }else if (aux.marca.charAt(0) > this.marca.charAt(0)){
            return -1;
        }
        return 0; //==
    }
    
    
    Codigo get(){
        return this;
    }
    
    void set(double preco, String marca, int qtd, String sabor, int val_dia, int val_mes, int val_ano){
  this.preco = preco;
  this.marca = marca;
  this.qtd = qtd;
  this.sabor = sabor;
  this.val_dia = val_dia;
  this.val_mes = val_mes;
  this.val_ano = val_ano;
        
    }
    
    
    void imprimir(){
       System.out.println("Marca: "+this.marca+" Preço: R$"+this.preco); 
       System.out.println("Validade: "+this.val_dia+"/"+this.val_mes+"/"+this.val_ano); 
System.out.println("-----------------------------------");
        
    }
    
}
