/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kevin
 */
public class PiezaPerdida {
    
    public void ejemplo(ArrayList<Integer> arr){
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        
        Collections.sort(arr);
        int num = 0;
        /*
        for(int i = 0; i < arr.size(); i++){
            num = (arr.get(i) != (i+1)) ? i+1 : 0;
            if(num != 0)
                System.out.println(i);
                break;
        }
        
        */
        System.out.println("El numero faltante es: " + num);
    }
    
    
    
    
    /*
    import java.util.*;

public class p168{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int sizePuz = sc.nextInt();
    
    while(sizePuz > 0){
     
      int[] puzzle = new int[sizePuz];
      
     
      for(int i = 0; i < sizePuz-1; i++){
        puzzle[i] = sc.nextInt();
      }
      
      Arrays.sort(puzzle);
      
   	  int num = 0;
     
      for(int i = 0; i < sizePuz; i++){
        if(sizePuz == 0){
          break;
        }
        
        num = (puzzle[i] != (i+1)) ? i+1 : 0;
            if(num != 0)
              	System.out.println(num);
                break;
      }
      sizePuz = sc.nextInt();
    }
  }
}
    
    */
    
}
