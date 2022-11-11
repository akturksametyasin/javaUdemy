
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
        
        //while döngüsü yardımıyla bir kullanıcı girişi yazmaya çalışın.
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3;
        
        String sys_kullaniciadi = "Mustafa Murat";
        String sys_parola = "12345";
        
        System.out.println("************************************");
        System.out.println("Kullanıcı girişine hoşgeldiniz...");
        System.out.println("************************************");
        
        while(true){
            System.out.print("Kullanıcı adı : ");
            String kullaniciadi = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            System.out.println("************************************");
            
            if(kullaniciadi.equals(sys_kullaniciadi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz " + kullaniciadi);
                break;
            }
            else if(kullaniciadi.equals(sys_kullaniciadi) && !parola.equals(sys_parola)){
                System.out.println("Parolanız yanlış!");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }
            else if(!kullaniciadi.equals(sys_kullaniciadi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı adınız yanlış!");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }
            else{
                System.out.println("Kullanıcı adınız ve parolanız yanlış");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }
            
            if(giris_hakki == 0){
                System.out.println("Giriş hakkınız bitti. Lütfen sonra tekrar deneyin...");
                break;
            }
        }
        
    }
}
