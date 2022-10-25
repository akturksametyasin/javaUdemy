
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
            break anahtar kelimesi
         
            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.
            
            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.
         
            continue anahtar kelimesi 
            
            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan 
            işlemlerini yapmadan direk döngü bloğunun başına döner.  
        */
        
        /*
        int i = 0;
        
        while (i < 20){
            if(i == 20){
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        */
        
        /*
        Scanner scanner = new Scanner(System.in);
        while(true){
            int islem = scanner.nextInt();
            if(islem == -1){
                System.out.println("Döngüden çıkıyor...");
                break;
            }
            System.out.println("İşlem : " + islem);
        }
        */
        
        /*
        for(int i = 0; i < 10; i++){
            if(i == 3 || i == 5){
                continue;
            }
            System.out.println("i = " + i);
        }
        */
        
        int i = 0;
        while(i < 10){
            if(i == 3 || i == 5){
                i++;
                continue;
            }
            System.out.println("i = " + i);
            i++;
        }
        
         
    }
}
