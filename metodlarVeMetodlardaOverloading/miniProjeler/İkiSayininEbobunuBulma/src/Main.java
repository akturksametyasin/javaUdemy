
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samet
 */
public class Main {
    public static int ebobBulma(int sayi1, int sayi2){
        int ebob = 1;
        for(int i = 1; i <= sayi1 && i <= sayi2; i++){
           if((sayi1 % i == 0) && (sayi2 % i == 0)){
               ebob = i;
           }
        }
        return ebob;
    }
    public static void main(String[] args) {
        System.out.println("EBOB Bulma Programı");
        System.out.println("***************************");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. Sayıyı giriniz : ");
        int birinciSayi = scanner.nextInt();
       
        System.out.print("2. Sayıyı giriniz : ");
        int ikinciSayi = scanner.nextInt();
        
        System.out.println("***************************");
        System.out.println("EBOB(" + birinciSayi + ", " + ikinciSayi + ") = " + ebobBulma(birinciSayi, ikinciSayi));
    }
}
