/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samet
 */
public class Main {
    /*
    public static int toplama(int a, int b, int c){
        //System.out.println(a +b + c);
        return(a + b + c);
    }
    */
    
    public static int ikiilecarp(int a){
        return a*2;
    }
    public static int ikiiletopla(int a){
        return a+2;
    }
    public static int dortilecarp(int a){
        return a*4;
    }
    
    public static void main(String[] args) {
        /*
        System.out.println("Çıktı değeri : " + toplama(1, 2, 3));
        */
        
        System.out.println(dortilecarp(ikiiletopla(ikiilecarp(8))));
    }
}
