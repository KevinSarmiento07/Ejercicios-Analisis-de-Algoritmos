/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Chavo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int ans = 0;
            int aux = sc.nextInt();                   // O(1)
            if (aux < 1) {                            // O(1)
                break;                                // O(1)
            }
            HashMap<String, String> map = new HashMap<>();  // O(1)
            while (aux-- > 0) {                       // O(n)
                map.put(sc.next(), sc.next());        // O(1)
            }
            int temp = sc.nextInt();                  // O(1)           
            while (temp-- > 0) {                      // O(m)
                String name = map.get(sc.next());     // O(1)
                String firma = sc.next();             // O(1)
                if (compareStr(name, firma)) {
                    ans++;    // O(n)
                }
            }
            System.out.println(ans);                  // O(1)
        }
    }

    public static boolean compareStr(String str1, String str2) {

        int diff = 0;
        for (int i = 0; i < str1.length(); i++) {     // O(n)
            if (str1.charAt(i) != str2.charAt(i)) {  // O(1)
                diff++;                             // O(1)
            }
        }
        return diff > 1;                             // O(1)
    }

}
