/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Glosario {

    public static void main(String[] args) { // O(1)
        Scanner s = new Scanner(System.in); // O(1)
        int nCasos = s.nextInt(); // O(1)
        while (nCasos > 0) { // O(nCasos)
            ArrayList<String> arr = new ArrayList<>(); // O(1)
            int palabras = s.nextInt(); // O(1)
            s.nextLine(); // O(1)
            while (s.hasNext()) { // O(m), donde m es el número total de palabras
                String lineaCompleta = s.nextLine().replaceAll("[^a-zA-Z0-9\\s]", ""); // O(m)
                String linea[] = lineaCompleta.split(" "); // O(m)
                if (linea[0].equals("FIN")) { // O(1)
                    break; // O(1)
                }
                for (int i = 0; i < linea.length; i++) { // O(m)
                    if (!arr.contains(linea[i])) { // O(n)
                        arr.add(linea[i]); // O(1)
                    }
                }

            }
            Collections.sort(arr); // O(nlogn)
            arr.add("-"); // O(1)
            for (int i = 0; i < arr.size(); i++) { // O(n)
                System.out.println(arr.get(i)); // O(1)
            }
            nCasos--; // O(1)
        }
    }
}
