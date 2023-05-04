/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Pares_Impares {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // O(1)
        int tamanio = s.nextInt(); // O(1)
        s.nextLine(); // O(1)

        String arrString[] = s.nextLine().split(" "); // O(N), donde N es la longitud de la entrada
        ArrayList<Integer> arr = new ArrayList<>(); // O(1)
        for (int i = 0; i < tamanio; i++) { // O(N)
            arr.add(Integer.parseInt(arrString[i])); // O(1)
        }

        int q = s.nextInt(); // O(1)
        s.nextLine(); // O(1)
        ArrayList<Integer> res = new ArrayList<>(); // O(1)
        for (int i = 0; i < q; i++) { // O(Q), donde Q es la cantidad de queries
            int par = 0, impar = 0; // O(1)
            String linea[] = s.nextLine().split(" "); // O(M), donde M es la longitud de la entrada
            int o = Integer.parseInt(linea[0]); // O(1)
            int x = (Integer.parseInt(linea[1])); // O(1)
            int y = (Integer.parseInt(linea[2])); // O(1)

            if (o == 0) {  // O(1)
                arr.set(x - 1, y);  // O(1)
            } else if (o == 1) {  // O(1)
                for (int j = x - 1; j <= y - 1; j++) {  // O(N)
                    if (arr.get(j) % 2 == 0) {  // O(1)
                        par++;  // O(1)
                    }
                }
                res.add(par);  // O(1)
            } else {  // O(1)
                for (int j = x - 1; j <= y - 1; j++) {  // O(N)
                    if (arr.get(j) % 2 != 0) {  // O(1)
                        impar++;  // O(1)
                    }
                }
                res.add(impar);  // O(1)
            }
        }

        for (int i = 0; i < res.size(); i++) { // O(Q)
            System.out.println(res.get(i)); // O(1)
        }

        /*
       Scanner s = new Scanner(System.in); // O(1)
int tamanio = s.nextInt(); // O(1)
s.nextLine(); // O(1)

String arrString[] = s.nextLine().split(" "); // O(N), donde N es la longitud de la entrada
ArrayList<Integer> arr = new ArrayList<>(); // O(1)
for(int i = 0; i < tamanio; i++){ // O(N)
arr.add(Integer.parseInt(arrString[i])); // O(1)
}

int q = s.nextInt(); // O(1)
s.nextLine(); // O(1)
ArrayList<Integer> res = new ArrayList<>(); // O(1)
for(int i = 0; i < q; i++){ // O(Q), donde Q es la cantidad de queries
int par= 0, impar = 0; // O(1)
String linea[] = s.nextLine().split(" "); // O(M), donde M es la longitud de la entrada
int o = Integer.parseInt(linea[0]); // O(1)
int x = (Integer.parseInt(linea[1])); // O(1)
int y = (Integer.parseInt(linea[2])); // O(1)


            
           if(o == 0){  // O(1)
    arr.set(x-1, y);  // O(1)
}else if(o == 1){  // O(1)
    for( int j = x-1; j <= y-1; j++ ){  // O(N)
        if(arr.get(j) %2 == 0){  // O(1)
            par++;  // O(1)
        }
    }
    res.add(par);  // O(1)
}else{  // O(1)
    for( int j = x-1; j <= y-1; j++ ){  // O(N)
        if(arr.get(j) %2 != 0){  // O(1)
            impar++;  // O(1)
        }
    }
    res.add(impar);  // O(1)
}
        }

for (int i = 0; i < res.size(); i++) { // O(Q)
System.out.println(res.get(i)); // O(1)
}
        
         */
    }

}
