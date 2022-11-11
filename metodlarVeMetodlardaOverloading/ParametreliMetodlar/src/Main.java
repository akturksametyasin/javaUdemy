/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samet
 */
public class Main {
    public static void toplama(int a, int b, int c){
        int toplam = a + b + c;
        System.out.println("Toplam = " + toplam);
    }
    public static void selamlama(String isim){
        System.out.println("Selamlar... " + isim);
    }
    public static void main(String[] args) {
        selamlama("Samet");
        selamlama("Ayşe");
        toplama(3, 4, 5);
        toplama(10, 12, 20);
    }
}
