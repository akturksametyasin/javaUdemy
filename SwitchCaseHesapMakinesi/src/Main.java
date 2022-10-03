
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Switch Casr Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        
        Scanner scanner = new Scanner(System.in);
        System.err.println("***********************************");
        String islemler = "1. Toplama İşlemi\n"
                            + "2. Çıkarma İşlemi\n"
                            + "3. Çarpma İşlemi\n"
                            + "4. Bölme İşlemi";
        System.err.println(islemler);
        System.err.println("***********************************");
        System.err.println("İşlemi seçiniz: ");
        String islem = scanner.nextLine();
        int a;
        int b;
        switch (islem) {
            case "1":
                System.out.println("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı : ");
                b = scanner.nextInt();
                System.err.println("***********************************");
                System.err.println("Girilen değerlerin toplamları : " + (a + b));
                System.err.println("***********************************");
                break;
            case "2":
                System.out.println("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı : ");
                b = scanner.nextInt();
                System.err.println("***********************************");
                System.err.println("Girilen değerlerin farkları : " + (a - b));
                System.err.println("***********************************");
                break;
            case "3":
                System.out.println("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı : ");
                b = scanner.nextInt();
                System.err.println("***********************************");
                System.err.println("Girilen değerlerin çarpımları : " + (a * b));
                System.err.println("***********************************");
                break;
            case "4":
                System.out.println("Birinci sayı : ");
                a = scanner.nextInt();
                System.out.println("İkinci sayı : ");
                b = scanner.nextInt();
                System.err.println("***********************************");
                System.err.println("Girilen değerlerin bölümleri : " + ((double)a / b));
                System.err.println("***********************************");
                break;
            default:
                System.err.println("***********************************");
                System.out.println("Geçersiz giriş!!!");
                System.err.println("***********************************");
        }
    }
}
