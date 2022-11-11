
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        /*
        System.out.println("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();        //scanner.nextLine(); komutu olmasaydı veri girdikten sonra enter'a bastığımız için direk String isim = scanner.nextLine(); için veri girişi yaptığımızı sandığından bu komutu atlayacaktı. scanner.nextLine(); komutu kullandık ve bu enter'ı algılayarak isim = scanner.nextLine(); komutunu es geçmemiş oldu. 
        scanner.nextLine();     // Dummy input alma deniyor.
        
        System.out.println("İsminizi giriniz : ");
        String isim = scanner.nextLine();
        
        System.out.println("Yaş: " + yas);
        System.out.println("İsim: "+ isim);
        */
        
        int yas1 = scanner.nextInt();       // giriş yaparken enterlayarak yazabildiğimiz gibi girdiğimiz verilerin arasına boşluk bırakarak da giriş sağlayabiliriz.
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        
        System.out.println("yas1 : " + yas1 + ", yas2: " + yas2 + ", yas3: " + yas3);
    }
}
