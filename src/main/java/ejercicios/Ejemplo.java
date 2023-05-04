/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ejemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizePuz = 10;

       

            int[] puzzle = {1,2,3,5,6,7,8,9,10};
            

            /*
            for (int i = 0; i < sizePuz - 1; i++) {
                puzzle[i] = i+1;
                
            }
            */

            Arrays.sort(puzzle);

            int num = 0;
            
            
            
            for (int i = 0; i < sizePuz - 1; i++) {
                System.out.println("puzzle["+ i + "] " + puzzle[i]);
            
            }

            for (int i = 0; i < sizePuz; i++) {
                System.out.println("Puzzle: " + puzzle[i] + " / i: " + i);

                num = (puzzle[i] != (i+1)) ? i+1 : 0;
                if (num != 0) {
                    System.out.println("numFaltante: " + num);
                    break;
                }
                
            }
            
        

    }

}
