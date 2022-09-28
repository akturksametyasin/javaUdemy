
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı
        bilgilerini alalım ve sürücünün toplam ne kadar ödemesi gerektiğini hesaplayalım.
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? (Örnek : 0,32) : ");
        double kurus = scanner.nextDouble();
        
        System.out.print("Aracınızla kaç kilometre gittiniz? (Örnek : 26,8) : ");
        double km = scanner.nextDouble();
        
        
        System.out.println("Toplam ödemeniz gereken tutar " + (kurus * km) + " TL'dir.");
        
    }
}
