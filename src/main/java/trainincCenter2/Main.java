/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainincCenter2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    private long a;
    private long b;

    public long getNumerador() {
        return a;
    }

    public void setNumerador(long numerador) {
        this.a = numerador;
    }

    public long getDenominador() {
        return b;
    }

    public void setDenominador(long denominador) {
        this.b = denominador;
    }

    public Main(long num, long den) {
        this.a = num;
        this.b = den;
    }

    public Main sumar(long c, long d) {
        long nuevoNum = (this.a * d) + (this.b * c);
        long nuevoDen = b * d;
        return new Main(nuevoNum, nuevoDen);
    }

    public Main restar(long c, long d) {
        long nNum = (a * d) - (b * c);
        long nDen = b * d;
        return new Main(nNum, nDen);
    }

    public Main multiplicar(long c, long d) {
        long nNum = a * c;
        long nDen = b * d;
        return new Main(nNum, nDen);
    }

    public Main dividir(long c, long d) {
        long nNum = a * d;
        long nDen = b * c;
        return new Main(nNum, nDen);
    }

    public static long obtenerMCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return obtenerMCD(b, a % b);
        }
    }

    public void simplificar() {
        long mcd = obtenerMCD(a, b);
        this.a /= mcd;
        this.b /= mcd;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String linea = s.nextLine();
        ArrayList<String> lista = new ArrayList<String>();
        long a, b, c, d;
        String operador;
        while (!linea.equals("")) {
            if (linea.equals(null) || linea.equals("") || linea.equals(" ")) {
                
                break;
            } else {
                
                String arr[] = linea.split(" ");
                a = Long.parseLong(arr[0]);
                b = Long.parseLong(arr[1]);
                c = Long.parseLong(arr[3]);
                d = Long.parseLong(arr[4]);
                operador = (String) arr[2];
                switch (operador) {
                    case "+":
                        Main fraccionSum = new Main(a, b);
                        Main suma = fraccionSum.sumar(c, d);
                        suma.simplificar();
                        lista.add(suma.getNumerador() + " " + suma.getDenominador());
                        
                        break;
                    case "-":
                        Main fraccionRes = new Main(a, b);
                        Main resta = fraccionRes.restar(c, d);
                        resta.simplificar();
                        lista.add(resta.getNumerador() + " " + resta.getDenominador());
                        
                        break;
                    case "*":
                        Main fraccionMul = new Main(a, b);
                        Main multi = fraccionMul.multiplicar(c, d);
                        multi.simplificar();
                        lista.add(multi.getNumerador() + " " + multi.getDenominador());
                        
                        break;
                    case "/":
                        Main fraccionDiv = new Main(a, b);
                        Main dividir = fraccionDiv.dividir(c, d);
                        dividir.simplificar();
                        lista.add(dividir.getNumerador() + " " + dividir.getDenominador());
                        
                        break;
                }
            }

            linea = s.nextLine();

        }
        s.close();
        
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

}
