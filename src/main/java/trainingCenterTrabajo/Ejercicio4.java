/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingCenterTrabajo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         for (int k = 0; k < 20; k++) {
            long startTime = System.nanoTime(); // Obtener tiempo inicial en nanosegundos
             File file = new File("K:\\KennedyS\\Kennedy\\Universidad\\7mo Semestre\\Analisis de Algoritmos\\Training_Cneter/Eslava100x100.txt");
        String linea;
        BufferedReader br = new BufferedReader(new FileReader(file));
                String[] anchAlt = "100 100".split(" ");
        int alto = Integer.parseInt(anchAlt[0]);
        int ancho = Integer.parseInt(anchAlt[1]);
        int[][] matriz = new int[alto][ancho];
        int pos = 0;
        while ((linea = br.readLine()) != null) {
                String[] numeros = linea.split(" ");
                for (int i = 0; i < numeros.length; i++) {
                    matriz[pos][i] = Integer.parseInt(numeros[i]);
                    if(pos == 0 || pos % 2 == 0) {
                        matriz[pos][i] += 1;
                    }
                    if(i == 0 || i % 2 == 0){
                        matriz[pos][i] += 2;
                    }
                    if(pos % 2 != 0 && i % 2 != 0){
                        matriz[pos][i] -= 3;
                    }
                }
                pos++;
                
        }
        String var;
        for(int i = 0; i < pos; i++){
            for (int j = 0; j < ancho; j++) {
                if(ancho-1 == j){
                    //System.out.print(matriz[i][j] + " ");
                }else{
                    //System.out.print(matriz[i][j] + " ");
                }
            }
            //System.out.println("");
        }
            long endTime = System.nanoTime(); // Obtener tiempo final en nanosegundos
            long duration = endTime - startTime; // Calcular la duración en nanosegundos
            // Convertir a diferentes unidades de tiempo y mostrar por consola
            System.out.println("T0,"+duration );
        }
    }
}