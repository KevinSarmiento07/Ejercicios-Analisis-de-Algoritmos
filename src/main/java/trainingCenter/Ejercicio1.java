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
public class Ejercicio1 {
    public static void main(String[] args) {
        //Big O(n*m)
        Scanner s = new Scanner(System.in); //2
        int nCasos = s.nextInt(); //2
        ArrayList<Integer> arr = new ArrayList<>(); //2
        System.out.println("nCasos" + nCasos); //1
        while(nCasos > 0){//n
            int registros = s.nextInt();//2
            System.out.println("registros" + registros);//1
            s.nextLine();//1
            //1     
            for(int i = 0; i < registros; i++){ //6*m  
                String bus[] = s.nextLine().split(" ");//2
                System.out.println("bus: 0: " + bus[0] + " : 1: "+ bus[1]);//1
                if(bus[0].equals("1")){//1
                    arr.add(Integer.parseInt(bus[1]));//1   
                }
            }
            nCasos--; //2
        }
        //1
        for (int i = 0; i < arr.size(); i++) { //2*n
            System.out.println(arr.get(i));
        }
    }
}
