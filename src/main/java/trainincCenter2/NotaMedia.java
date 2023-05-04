/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class NotaMedia {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int nCasos = s.nextInt();
        s.nextLine();
        ArrayList<Integer> def = new ArrayList<>();
        
        while(nCasos > 0){
            
            ArrayList<Integer> notas = new ArrayList<>();
            
            String arr[] = s.nextLine().split(" ");
            notas.add(Integer.parseInt(arr[0]));
            notas.add(Integer.parseInt(arr[1]));
            notas.add(Integer.parseInt(arr[2]));
            
            Collections.sort(notas);
            def.add(notas.get(1));
            nCasos--;
        }
        
        
        for (int i = 0; i < def.size(); i++) {
            System.out.println(def.get(i));
        }
    }
    
}
