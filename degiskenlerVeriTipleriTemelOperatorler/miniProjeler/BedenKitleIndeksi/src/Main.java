
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Kullanıcıdan aldığımız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulalım.
        
        Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuzu kilogram cinsinden giriniz (Örnek: 80,6): ");
        float kilo = scanner.nextFloat();
        
        System.out.print("Boyunuzu metre cinsinden giriniz (Örnek: 1,85): ");
        float boy = scanner.nextFloat();
        
        
        float bki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + bki);
        
    }
}
