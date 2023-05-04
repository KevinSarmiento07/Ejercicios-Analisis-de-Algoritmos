/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainingCenter;
import java.util.Scanner;
/**
 * @author kevin
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        //Big O(n*m)  
        Scanner s = new Scanner(System.in);//2
        int nCasos = s.nextInt();//2
        s.nextLine();//1
        while(nCasos > 0){//n
            String enteroStr[] = s.nextLine().split(" ");//2
            int arr[][] = new int[Integer.parseInt(enteroStr[0])][Integer.parseInt(enteroStr[1])];//2
            //1
            for(int i = 0; i < Integer.parseInt(enteroStr[0]); i++){//3n*12m  
                String fila[] = s.nextLine().split(" ");//2
                //1
                for (int j = 0; j < Integer.parseInt(enteroStr[1]); j++) {//m*12
                     arr[i][j] = Integer.parseInt(fila[j]);//1
                    if(i %2 == 0){//1
                        arr[i][j] += 1;//2
                    }
                    if(j % 2 == 0){//1
                        arr[i][j] += +2;//2
                    }
                    
                    if(i % 2 != 0 && j %2 != 0){//3
                        arr[i][j] -= 3;//2
                    }
                }
            }
            //1
            for(int i = 0; i < Integer.parseInt(enteroStr[0]); i++){//n*2m
                //1
                for (int j = 0; j < Integer.parseInt(enteroStr[1]); j++) {//m*2
                    if(j == Integer.parseInt(enteroStr[1])-1){//1
                        System.out.print(arr[i][j]);//1
                    }else{
                        System.out.print(arr[i][j] + " ");//1
                    }
                }
                System.out.println("");//1
            }
            nCasos--;
        }
    }
}
