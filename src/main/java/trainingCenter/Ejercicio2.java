/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingCenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author kevin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //2n + 10m*n + 7
        //Big O(n*m)
        Scanner s = new Scanner(System.in); //2
        int n = s.nextInt();//2
        ArrayList<String> arr = new ArrayList<>();//2
        while(n > 0){ //12 + 10m*n 
            int t = s.nextInt();//2
            s.nextLine();//1
            String []datos = s.nextLine().split(" ");//2
            //1
            for(int i = 0; i < t; i++){ // (8*m)
                if(datos[i].equals("1")){//1 + 1 + 2 + 3 = 7
                    datos[i] = "0";//1
                    int pos = Arrays.asList(datos).indexOf("2");//2
                    if(pos >= i ){//2 + 1 = 3
                        datos[pos] = "0";//1
                    }else{
                        break;//1
                    }
                }
            }
            //1
            for(int j = 0; j < t; j++){//2*m
                System.out.println("dato: " + datos[j]);//1
            }
             if(Arrays.asList(datos).contains("1") || Arrays.asList(datos).contains("2")){//1 + 2 = 3
                    arr.add("INCORRECTO");//1
                    System.out.println("INCORRECTO");//1
                }else{
                    arr.add("CORRECTO");//1
                    System.out.println("CORRECTO");//1

                }
            n--; // 2
        }
        //1
        for (int i = 0; i < arr.size(); i++) {//1+1 *n = 2*n
            System.out.println(arr.get(i));//1
            
        }
    }
}
