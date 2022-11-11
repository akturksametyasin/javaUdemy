
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
    public static void selamlama(){
        System.out.println("Merhaba, Nasılsınız ? ");
        System.out.println("Selamlar...");
    }
    
    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        while(sayi > 0){
            faktoriyel *= sayi;
            sayi --;
        }
        
        System.out.println("Faktöriyel = " + faktoriyel);
    }
    
    public static void main(String[] args) {
    /*
    Erisim_Belirleyici(Opsiyonel) Ekstra_Ozellikler Donus_Tipi Fonksiyon_Adi(Parametreler){
       
        //burası fonksiyon bloğu
    
        //fonksiyonun yapacağı işlemler burada olacak.
    
    }
    */   
    
        selamlama();
    
        selamlama();
        
        faktoriyel();
        
        faktoriyel();
    }
}
