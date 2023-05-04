/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises_FF;

/**
 *
 * @author kevin
 */
public class FourtyFiveProblems {
    //f(g) = 7n+4
    //O(g) = O(n) 
    int a10(int m){//1
        int r = -1;//1
        int p = m;//1
        do{
            if(p%3!=0) p--;//3
            else p/=3;//2
            r++;//1
        }while(p!=0);//
        return r;//1
    }
    
    
    //f(n) = 7n + 4
    int a11(int k){//1
        int r = -1;//1
        int q = k;//1
        while(q!=0){//n*7
            if(q%3!=0) q--;//3
            else q/=3;//2
            r++;//1
        }
        return r;//1
    }
    
    
    //f(n) = 7n+6
    boolean a14(char l[]){//1
        boolean a = true;//1
        int i=l.length/2-1; //3
        do{
            a = l[i]==l[l.length-1-i];//4
            i--;//1
        }while(a&&i>=0);//(2 + 5)*n
        return a;//1
    }
}
