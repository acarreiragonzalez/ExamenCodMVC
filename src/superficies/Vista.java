/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author oracle
 */
public class Vista {
    //método que recolle os valores establacidos na clase Modelo pola clase Superficies, e que imprime os diferentes resultados dependendo do valor de get Resposta dado anteriormente.
    public static void imprimir(Modelo mod){
        
        if (mod.getResposta()==1)
            
            System.out.println("The area for your square: " + mod.getResultado());
        
        
        if (mod.getResposta()==2)
            
             System.out.println("The area for your rectangle is: " + mod.getResultado());
        
        if (mod.getResposta()==3)
            
            System.out.println("Your triangles area is: " + mod.getResultado());
        
        if (mod.getResposta()==4)
            
            System.out.println("Your Circles area is " + mod.getResultado());
        
        
        
        
    }
    
}
