/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises_FF;

/**
 *
 * @author kevin
 */
public class Main {
    public static void main(String[] args) {
        
        for(int i = 0;i < 10; i++){
            System.out.println("n");
        }
   
        boolean b = true;
        
            long inicio = System.nanoTime();
            FourtyFiveProblems ffP = new FourtyFiveProblems();
            
            String cadena = "dabale arroz a la zorra el abad";
            char []arr = {'o','t','t','o'};
            
           
                
            
             b = ffP.a14(arr);
            
            long fin = System.nanoTime();
            System.out.println(" boolean: " + b + " Tiempo de compilación: " +  (fin - inicio) + " nanosegundos.");
            //System.out.println((fin-inicio));

            
            
        
        
        
        
        
        
        
        
    }
    
}
