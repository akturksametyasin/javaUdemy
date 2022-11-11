
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
        do{
            //koşul doğru olduğu sürece çalışır.
            //while'dan farkı en az bir kere çalışmasının garanti olması.
        } while(koşul);
        */
        
        /*
        int i = 0;
        do {            
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        int ilksayi = sayi;
        int toplam = 0;
        
        do {            
            toplam += sayi % 10;
            sayi /= 10;
        } while (sayi > 0);
        
        System.out.println(ilksayi + " sayısının rakamları toplamı = " + toplam);
        
    }
}
