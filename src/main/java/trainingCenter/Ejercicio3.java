/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingCenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author kevin
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        //5 + 22n*5m
        //Big O(n*m)
        Scanner s = new Scanner(System.in); //2
        int tCasos = s.nextInt(); //2
        System.out.println("tCasos"+tCasos);//1
        while(tCasos > 0){//22n*5m
            ArrayList<Integer> arr = new ArrayList<>();//2
            int nDias = s.nextInt();//2
            System.out.println("Dias " + nDias);//1
            int contador= 0;//1
            //1
            for(int i = 0; i < nDias; i++){//5m
                int numero = s.nextInt();//1
                if(arr.contains(numero)){//1 + 4 = 5
                    System.out.println("Continue");
                    continue;
                }else{//4
                    System.out.println("agregado"+ numero);//1
                    arr.add(numero);//1
                    contador++;//2
                }
            }
            System.out.println("tamaño del arr" + arr.size());//1
            Collections.sort(arr);//1
            int temprHoras = (arr.get(0))/60;//2
            int temprMin = (arr.get(0))%60;//2
            int tardHoras =  (arr.get(arr.size()-1))/60;//2
            int tardMin = (arr.get(arr.size()-1))%60;//2
            System.out.println("Horas diferentes: " + contador);//1
            System.out.println("Temprano: " + temprHoras+":"+temprMin);//1
            System.out.println("Tarde: " + tardHoras + ":" + tardMin);//1
            tCasos--;//2
        }
    }
}
