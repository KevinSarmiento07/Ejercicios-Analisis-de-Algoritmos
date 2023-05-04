/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingCenter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author kevin
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        //Big O(n^2)
        Scanner s = new Scanner(System.in);
        int tCasos = s.nextInt();
        while(tCasos >0){
            int numero = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> dispersa = new ArrayList<>();
            for(int i = 0; i < numero ; i++){
              arr.add(i+1);
            }
            int tamano = arr.size();
            for (int i = 0; i < tamano-1; i++) {
                dispersa.add(arr.get(0));
                arr.remove(0);
                if(arr.size() != 1){
                    arr.add(arr.get(0));
                    arr.remove(0);
                }
            }
            dispersa.add(arr.get(0));
            for(int i = 0; i < dispersa.size(); i++){
                System.out.println(dispersa.get(i));
            }
            System.out.println('-');
            tCasos--;
        }
    }
}
