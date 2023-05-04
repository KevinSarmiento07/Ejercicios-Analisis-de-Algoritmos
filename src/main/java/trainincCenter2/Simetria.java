/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.Scanner;

public class Simetria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        while(casos-- > 0){
            System.out.println(logoSimetrico(scan));
        }
    }


    public static String logoSimetrico(Scanner scan){
        int tamanioMatriz = scan.nextInt();
        scan.nextLine();

        String[] matriz = new String[tamanioMatriz];
        for (int i = 0; i < tamanioMatriz; i++) {
            matriz[i] = scan.nextLine();
        }

        for (int i = 0; i < tamanioMatriz/2; i++) {
            if(!matriz[i].equals(matriz[tamanioMatriz-i-1]) || !matriz[i].equals(new StringBuilder(matriz[i]).reverse().toString())){
                return "NO";
            }
        }
        return "YES";
    }
}
/*
        Scanner s = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int nCasos = s.nextInt();
        while(nCasos-- >0){
            int tamanio = s.nextInt();
            s.nextLine();
            char matriz[][] = new char [tamanio][tamanio]; 
            for(int i = 0; i < tamanio;  i++){
                String linea = s.nextLine();
                for(int j = 0; j < tamanio; j++){
                    matriz[i][j] = (linea.charAt(j));
                }
            }
            boolean diferencia = false;
            int ultimoI = tamanio-1;
            for(int i = 0; i < tamanio;  i++){
                int ultimoJ = tamanio-1;
                for(int j = 0; j < tamanio; j++){
                    if(matriz[i][j] != matriz[ultimoI][ultimoJ]){
                        diferencia = true;
                        break;
                    }
                    ultimoJ--;
                }
                if(diferencia){
                    break;
                }
                ultimoI--;
            }
            if(diferencia == true){
                arr.add("NO");
            }else{
                arr.add("YES");
            }
        }
        
        for(int i = 0; i < arr.size(); i++){
            if(i == arr.size()-1){
                System.out.print(arr.get(i));
            }else{
                System.out.println(arr.get(i));
            }
            
        }
 */
