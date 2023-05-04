/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalabraMasComun {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nCasos = s.nextInt(); // O(1)
        s.nextLine(); // O(1)
        while (nCasos > 0) {
            ArrayList<String> arr = new ArrayList<>(); // O(1)
            String linea[] = s.nextLine().split(" "); // O(m), donde m es el número de palabras en la línea
            int palabras = Integer.parseInt(linea[0]); // O(1)
            for (int i = 1; i <= palabras; i++) {
                arr.add(linea[i]); // O(1)
            }
            System.out.println(palabraMasRepetida(arr)); // O(n log n), donde n es el número de palabras en la lista
            nCasos--; // O(1)
        }
    }

    public static String palabraMasRepetida(ArrayList<String> list) {
        ArrayList<String> arr = new ArrayList<>(); // O(1)
        Map<String, Integer> map = new HashMap<String, Integer>(); // O(1)
        String palabraMasRepetida = ""; // O(1)
        int maxRepeticiones = 0; // O(1)
        for (String palabra : list) { // O(n), donde n es el número de palabras en la lista
            if (map.containsKey(palabra)) {
                int repeticiones = map.get(palabra) + 1; // O(1)
                map.put(palabra, repeticiones); // O(1)
                if (repeticiones > maxRepeticiones) {
                    maxRepeticiones = repeticiones; // O(1)
                    palabraMasRepetida = palabra; // O(1)
                }
            } else {
                map.put(palabra, 1); // O(1)
            }
        }
        if (maxRepeticiones == 0) { // O(1)
            maxRepeticiones = 1; // O(1)
        }
        int contador = 0; // O(1)
        for (Map.Entry<String, Integer> entry : map.entrySet()) { // O(n), donde n es el número de pares llave-valor en el mapa
            if (entry.getValue().equals(maxRepeticiones)) {
                contador++; // O(1)
            }
        }
        if (contador == 1) { // O(1)
            return palabraMasRepetida; // O(1)
        } else {
            for (Map.Entry<String, Integer> entry : map.entrySet()) { // O(n), donde n es el número de pares llave-valor en el mapa
                int maxRep = maxRepeticiones; // O(1)
                if (entry.getValue() == maxRep) {
                    arr.add(entry.getKey()); // O(1)
                }
            }
            Collections.sort(arr); // O(n log n), donde n es el número de palabras en la lista
            return arr.get(0); // O(1)
        }
    }
}
