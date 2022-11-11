import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Dik üçgenin uzun kenarı(hipotenüs) = (a^2 + b^2)^(1/2)
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("Üçgenin birinci dik kenarını giriniz: ");
        a = scanner.nextInt();
        
        System.out.println("Üçgenin ikinci dik kenarını giriniz: ");
        b = scanner.nextInt();
        
        double h = Math.sqrt(a * a + b * b);        // javada hazır bulunan math kütüphanesini kullandık. Math.sqrt() --> parantez içine aldığı değerin karekökünü alır.
        System.out.println("Üçgenin uzun kenarı(hipotenüs): " + h);
    }
}
