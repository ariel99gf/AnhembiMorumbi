/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.ArrayList;

/**
 *
 * @author prof208
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        DVD objeto1 = new DVD();
        
        objeto1.set("Capitã Marvel", "Ação", 180, "Marvel", "Anna e Ryan", 12);
        
        DVD objeto2 = new DVD();
        
        objeto2.set("Harry Potter 7 parte 2", "Fantasia", 150, "Warner", "J.K.Rowling", 14);

        DVD objeto3 = new DVD();

        objeto3.set("Homem-Aranha: No Aranhaverso", "Animação", 117, "Sony", "B P R", 0);

        
        DVD objeto4 = new DVD();

        objeto4.set("Alice", "Fantasia", 135, "Disney", "Tim Burton", 0);

        

        ArrayList biblioteca = new ArrayList();
        
        
        biblioteca.add(objeto1);
        
        biblioteca.add(objeto2);
        
        biblioteca.add(objeto3);
        
        biblioteca.add(objeto4);
        
        biblioteca.remove(1);

        
        for(int i = 0; i<biblioteca.size(); i++){
            
           DVD obj = (DVD) biblioteca.get(i);// 0 size casting
           obj.impressao();
        }
        
        
        
    }
    
}
