
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // İdman Oluşturma Programı
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İdman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                            + "Burpee\n"
                            + "Push Up (Şınav)\n"
                            + "Sit Up (Mekik)\n"
                            + "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun.");
        
        System.out.print("Burpee Sayisi : ");
        int burpeeSayisi = scanner.nextInt();
        
        System.out.print("Push Up Sayisi : ");
        int pushUpSayisi = scanner.nextInt();
        
        System.out.print("Sit Up Sayisi : ");
        int sitUpSayisi = scanner.nextInt();
        
        System.out.print("Squat Sayisi : ");
        int squatSayisi = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(pushUpSayisi, pushUpSayisi, sitUpSayisi, squatSayisi);
        
        System.out.println("İdmanınız başlıyor...");
        
        while(idman.idmanBittiMi() == false){
            System.out.print("Hareket Türü (Burpee, PushUp, SitUp, Squat) : ");
            String hareketTuru = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız : ");
            int hareketSayisi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketYap(hareketTuru, hareketSayisi);
        }
        
        System.out.println("İdmanı başarıyla bitirdin!");
        System.out.println("Programdan çıkmak için herhangi bir tuşa basın.");
        scanner.nextLine();
    }
}
