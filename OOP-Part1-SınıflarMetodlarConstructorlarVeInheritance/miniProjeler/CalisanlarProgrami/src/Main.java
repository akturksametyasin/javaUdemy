
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*
        Çalışanlar programı
        
        Çalışan Sınıfı şeklinde bir üst sınıf
        
        Çalışan sınıfından türeyen Yazılımcı adınfa bir alt sınıf
        Çalışan Sınıfından türeyen Yönetici adında bir alt sınıf
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        
        String islemler = "İslemler...\n"
                            + "1. Yazılımcı işlemleri\n"
                            + "2. Yönetici işlemleri\n"
                            + "Çıkış için q'ya basın.";
        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");
        
        while(true){
            System.out.print("İşlemi seçin : " );
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Samet", "Aktürk", 567, "Java, C++");
                String yazilimciIslem = "***Yazılımcı İşlemleri***\n"
                                        + "1. Format at\n"
                                        + "2. Bilgileri göster\n"
                                        + "Çıkış için q'ya basın.";
                System.out.println(yazilimciIslem);
                while(true){
                    System.out.print("İşlemi seçin : ");
                    String yIslem = scanner.nextLine();
                    
                    if(yIslem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinde çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.print("İşletim sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }
                    else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yazılımcı işlemi!");
                    }
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);
                String yoneticiIslem = "***Yönetici İşlemleri***\n"
                                        + "1. Zam yap\n"
                                        + "2. Bilgileri göster\n"
                                        + "Çıkış için q'ya basın.";
                System.out.println(yoneticiIslem);
                while(true){
                    System.out.print("İşlemi seçin : ");
                    String yIslem = scanner.nextLine();
                    
                    if(yIslem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if(yIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yönetici işlemi!");
                    }
                }
            }
            else{
                System.out.println("Geçersiz işlem!");
            }
        }
    }
}
