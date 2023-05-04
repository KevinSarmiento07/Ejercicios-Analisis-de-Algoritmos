/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList; // O(1)
import java.util.Scanner; // O(1)

/**
 *
 *
 * @author kevin
 */
public class Piedra_P_T2 {

    public static ArrayList<String> lista = new ArrayList<>(); // O(1)

// Función que determina el ganador del juego
    public static String juego(String arr[]) {
        if (arr[0].equals(arr[1])) { // O(1)
            return "Empate"; // O(1)
        } else if (arr[0].equals("tijera") && arr[1].equals("papel") || arr[0].equals("tijera") && arr[1].equals("lagarto") || arr[0].equals("papel") && arr[1].equals("piedra")
                || arr[0].equals("papel") && arr[1].equals("spock") || arr[0].equals("piedra") && arr[1].equals("lagarto") || arr[0].equals("piedra") && arr[1].equals("tijera")
                || arr[0].equals("lagarto") && arr[1].equals("spock") || arr[0].equals("lagarto") && arr[1].equals("papel") || arr[0].equals("spock") && arr[1].equals("tijera")
                || arr[0].equals("spock") && arr[1].equals("piedra")) { // O(1)
            return "Sheldon"; // O(1)
        } else {
            return "Rajesh"; // O(1)
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // O(1)
        int nCasos = s.nextInt(); // O(1)
        s.nextLine(); // O(1)
        while (nCasos > 0) {
            String arr[] = s.nextLine().split(" "); // O(1)
            lista.add(juego(arr)); // O(1)
            nCasos--; // O(1)
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); // O(n)
        }
    }
}
