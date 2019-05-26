/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.ArrayList;

/**
 *
 * @author prof208
 */
public class Bomboniere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Chiclete chiclet1 = new Chiclete();
        chiclet1.set(1.48, "Trident", 23, "Tutti Fruti", 27, 3, 2020);

        Chiclete chiclet2 = new Chiclete();
        chiclet2.set(1.38, "Mentos", 11, "Morango", 27, 3, 2021);

        Chiclete chiclet3 = new Chiclete();
        chiclet3.set(0.49, "Bubbaloo", 110, "Uva", 27, 3, 2022);
        
        Refrigerante coca = new Refrigerante();
        coca.set(2.99, "Coca Cola", 7, "Vanilla", 10, 10, 1990);
        
        
        Refrigerante fanta = new Refrigerante();
        fanta.set(2.89, "Fanta", 3, "Uva", 10, 10, 2022);
        
        fanta.formulaSecreta="Citrus";
        
        Refrigerante jesus = new Refrigerante();
        jesus.set(6.99, "Guaraná Jesus", 5, "Chá", 10, 10, 2021);
        
        jesus.formulaSecreta="Salvação";
        
        
        coca.formulaSecreta = "Felicidade";
        
        ArrayList <Codigo> lista = new ArrayList();
        
        lista.add(chiclet1);
        
        lista.add(chiclet2);

        lista.add(chiclet3);

        lista.add(coca);
        
        lista.add(fanta);

        lista.add(jesus);

        
        lista.sort(null);
        
        for(int i = 0; i < lista.size();i++){
            
            lista.get(i).imprimir();
            
           Refrigerante aux = new Refrigerante();
            
            if(lista.get(i).getClass()==aux.getClass()){
                
                aux = (Refrigerante) lista.get(i);
                
                System.out.println(aux.formulaSecreta);
            }
            
        }
        
        
    }
    
    
}
