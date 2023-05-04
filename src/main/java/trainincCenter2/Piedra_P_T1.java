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
public class Piedra_P_T1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);                  // O(1)
        int nCasos = s.nextInt();                            // O(1)
        while(nCasos > 0){                                   // O(n)
            int a= 0, b= 0 , e= 0;                           // O(1)
            ArrayList<String> arr = new ArrayList<>();       // O(1)
            int reg = s.nextInt();                           // O(1)
            s.nextLine();                                    // O(1)
            for(int i = 0; i < reg; i++){                    // O(n)
                arr.add(s.nextLine());                       // O(1)
            }
            for(int i = 0; i < arr.size(); i++){             // O(n)
                
                if(arr.get(i).equals("ALICE")){               // O(1)
                    a++;                                     // O(1)
                }else if(arr.get(i).equals("BOB")){           // O(1)
                    b++;                                     // O(1)
                }else{                                        // O(1)
                    e++;                                     // O(1)
                }
            }
            if(a == b){                                      // O(1)
                System.out.println("EMPATE");                // O(1)
            }else if(Math.max(a, b) == a){                   // O(1)
                System.out.println("ALICE");                 // O(1)
            }else if(Math.max(a, b) == b){                   // O(1)
                System.out.println("BOB");                   // O(1)
            }
            nCasos--;                                         // O(1)
        }
    }
}
