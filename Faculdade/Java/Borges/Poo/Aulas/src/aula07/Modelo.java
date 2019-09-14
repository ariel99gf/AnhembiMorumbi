/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author prof208
 */
public class Modelo implements Comparable{
    String marca;
    String cor;
    double preco;
    String formato;
    
     void set(String marca, String cor, double preco, String formato){
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.formato = formato;
    }
     
     void imprimir(){
         System.out.print(this.marca+" - ");
         System.out.print(this.cor+" - ");
         System.out.print(this.preco+" - ");
         System.out.print(this.formato);
         System.out.println();

     }
     
     
     public int compareTo(Object o){
        Modelo mobj = (Modelo)o;
    
    if(this.preco<mobj.preco)
          return -1;
    else if(mobj.preco<this.preco)
          return 1;
    return 0;
}
     
   
     
}
