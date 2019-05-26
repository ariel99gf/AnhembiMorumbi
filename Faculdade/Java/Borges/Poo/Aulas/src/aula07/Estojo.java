/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.ArrayList;

/**
 *
 * @author prof208
 */
public class Estojo {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        
        Apontador ap = new Apontador();
        
        ap.set("Faber Castell", "Azul", 4.99, "Retangular");
        ap.comDeposito = true;
        
        Borracha br = new Borracha();
        br.set("Mercur", "Branca", 1.99, "Quadrada");
        
        Caneta can = new Caneta();
        can.set("Bic", "Preta", 0.99 , "Esferográfica");
        
        Cola co = new Cola();
        co.set("Pritt", "Branca", 14.99, "Bastão");
            
        Corretivo cor = new Corretivo();
        cor.set("Maxprint", "Branca", 4.99, "Fita");
        
        Lapis la = new Lapis();
        la.set("Bic", "Grafite", 0.75, "Rendondo");
        
        Tesoura te = new Tesoura();
        te.set("Mundial", "Vermelho", 12.90, "Sem ponta");
        
        
        cor.imprimir();
        
        ArrayList al = new ArrayList ();
        al.add(ap);
        al.add(br);
        al.add(can);
        al.add(co);
        al.add(cor);
        al.add(la);
        al.add(te);
        
     
       for(int i = 0; i<al.size(); i++){
           Modelo obj = (Modelo) al.get(i);
           obj.imprimir();
        }
       
        al.sort(null);
        
    System.out.println("---------------------------------");
        for(int i = 0; i<al.size(); i++){
           Modelo obj = (Modelo) al.get(i);
           obj.imprimir();
        }
    }
    
}
