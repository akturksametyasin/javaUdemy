
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
    
    public static void main(String[] args) {
        
        /*
        Girilen bir sayının armstron sayısı olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
        
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Basmak sayısı giriniz : ");
        int basamakSayisi = scanner.nextInt();
        
        int geciciSayi = sayi;
        int toplam = 0;
        
        do {            
            int basamakDegeri = geciciSayi % 10;
            geciciSayi /= 10;
            
            toplam += Math.pow(basamakDegeri, basamakSayisi);
            
        } while (geciciSayi > 0);
        
        if(sayi == toplam){
            System.out.println("Bu sayı bir armstrong sayısıdır.");
        }
        else{
            System.out.println("Bu sayı bir armstrong sayısı değildir.");
        }
        
    }
}
