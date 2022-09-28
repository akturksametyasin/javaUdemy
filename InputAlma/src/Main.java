
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);       // scanner objesi oluşturuldu. system.in ile scanner objesine veri girişi sağlanır.
        /*
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();        // scanner objesinin içerisindeki nextInt metodunu kullan. veri girişi olduğunda nextInt bu veriyi alır ve yas değişkenine atama yapar.                   
        System.out.println("Yaşınız: " + yas);
        
        
        System.out.println("Lütfen sayı giriniz: ");
        double sayi = scanner.nextDouble();
        System.out.println("Sayı: " + sayi);
        
        
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = scanner.nextLine();                 
        System.out.println("Adınız: " + ad);
        */
        
        if(scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("sayı: " + sayi);
        }
        else{
            System.out.println("Geçersiz giriş, sayı girişi yapın.");
        }

    }
}
