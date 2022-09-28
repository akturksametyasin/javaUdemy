
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        
        Kullanıcıdan alınan boy ve kilo değerlerine göre beden kitle indeksini hesaplayın ve şu kurallara göre ekrana şu yazıları yazdırın:

            Beden Kitle İndeksi: Kilo / Boy(m) *  Boy(m)

            BKİ 18.5'un altındaysa -----------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz (Örn:1,81): ");
        double boy = scanner.nextDouble();
        
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz (Örn:85,5) : ");
        double kilo = scanner.nextDouble();
        
        double bki = (kilo / (boy * boy));
        if(bki < 18.5){
            System.out.println("Beden kitle indeksiniz : " + bki + " - Zayıf");
        }
        else if(18.5 <= bki && bki < 25){
            System.out.println("Beden kitle indeksiniz : " + bki + " - Normal");
        }
        else if(25 <= bki && bki < 30){
            System.out.println("Beden kitle indeksiniz : " + bki + " - Fazla kilolu");
        }
        else{
            System.out.println("Beden kitle indeksiniz : " + bki + " - Obez");
        }
        
    }
    
}
