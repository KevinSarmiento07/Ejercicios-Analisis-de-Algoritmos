/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Invertido {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // O(1)
        int nCasos = s.nextInt(); // O(1)
        s.nextLine(); // O(1)
        while (nCasos > 0) { // O(n)
            ArrayList<Integer> numeros = new ArrayList<>(); // O(1)
            String arr[] = s.nextLine().split(" "); // O(n)
            int fila = Integer.parseInt(arr[0]); // O(1)
            int colum = Integer.parseInt(arr[1]); // O(1)
            int matriz[][] = new int[fila][colum]; // O(1)
            for (int i = 0; i < fila; i++) { // O(n^2)
                String linea[] = s.nextLine().split(" "); // O(n)
                for (int j = 0; j < colum; j++) { // O(n)
                    matriz[i][j] = Integer.parseInt(linea[j]); // O(1)
                    numeros.add(matriz[i][j]); // O(1)
                }
            }
            Collections.reverse(numeros); // O(n)
            int iterador = 0; // O(1)
            for (int i = 0; i < fila; i++) { // O(n^2)
                for (int j = 0; j < colum; j++) { // O(n)
                    if (j == colum - 1) { // O(1)
                        System.out.print(numeros.get(iterador)); // O(1)
                    } else {
                        System.out.print(numeros.get(iterador) + " "); // O(1)
                    }
                    iterador++; // O(1)
                }
                System.out.println(""); // O(1)
            }
            nCasos--; // O(1)
        }
    }
}
