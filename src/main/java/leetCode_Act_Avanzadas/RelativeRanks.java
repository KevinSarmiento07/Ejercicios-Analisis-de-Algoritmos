/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetCode_Act_Avanzadas;

import java.util.Random;

/**
 *
 * @author kevin
 */
public class RelativeRanks {
    
    public static void main(String[] args) {
       Random random = new Random();

        // Realizar 5 casos de prueba automáticos
        for (int testCase = 1; testCase <= 5; testCase++) {
            System.out.println("Test Case #" + testCase + ":");

            // Generar un conjunto de valores de prueba aleatorios
            int[] score = generateTestCase(random.nextInt(10) + 1);

            // Procesar los valores de prueba
            int[] nums = score;
            String[] result = new String[nums.length];
            int max = 0;
            for (int i : nums) {
                if (i > max) max = i;
            }
            int[] hash = new int[max + 1];
            for (int i = 0; i < nums.length; i++) {
                hash[nums[i]] = i + 1;
            }
            int place = 1;
            for (int i = hash.length - 1; i >= 0; i--) {
                if (hash[i] != 0) {
                    if (place == 1) {
                        result[hash[i] - 1] = "Gold Medal";
                    } else if (place == 2) {
                        result[hash[i] - 1] = "Silver Medal";
                    } else if (place == 3) {
                        result[hash[i] - 1] = "Bronze Medal";
                    } else {
                        result[hash[i] - 1] = String.valueOf(place);
                    }
                    place++;
                }
            }

            // Imprimir los resultados
            for (int i = 0; i < result.length; i++) {
                System.out.println("result: " + result[i]);
            }

            System.out.println(); // Imprimir una línea en blanco después de cada caso de prueba
        }
    }

    // Método para generar un conjunto de valores de prueba aleatorios
    private static int[] generateTestCase(int length) {
        Random random = new Random();
        int[] testCase = new int[length];
        for (int i = 0; i < length; i++) {
            testCase[i] = random.nextInt(100) + 1; // Generar valores aleatorios entre 1 y 100
        }
        return testCase;
    }
}