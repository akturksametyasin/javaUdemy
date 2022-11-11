
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
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
        
        Faiz oranı : %6
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz Oranı %6");
        
        int anapara, vade;
        System.out.print("Yatırmak istediğiniz tutar: ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz: ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for(int i = 1 ; i <= vade ; i++){
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ". yılın sonunda toplam para : " + (int)toplampara);
        }
    }
}
