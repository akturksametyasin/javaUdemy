
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int birinciSayi;
        int ikinciSayi;
        
        System.out.print("Birinci sayı: ");
        birinciSayi = scanner.nextInt();
        
        System.out.print("İkinci sayı: ");
        ikinciSayi = scanner.nextInt();
        
        System.out.println("Değiştirilmeden önce: ");
        System.out.println("Birinci sayı: " + birinciSayi + "  |  İkinci sayı: " + ikinciSayi);
        
        
        int gecici = birinciSayi;
        birinciSayi = ikinciSayi;
        ikinciSayi = gecici;
        
        System.out.println("Değiştirildikten sonra: ");
        System.out.println("Birinci sayı: " + birinciSayi + "  |  İkinci sayı: " + ikinciSayi);
        
        
    }
}
