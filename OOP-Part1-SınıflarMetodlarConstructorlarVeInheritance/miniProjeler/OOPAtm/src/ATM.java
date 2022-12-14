
import java.util.Scanner;

public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz...");
        
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("******************************");
        
        int girisHakki = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan giriş hakkı = " + girisHakki);
            }
            if(girisHakki == 0){
                System.out.println("Giriş hakkınız bitti! Lütfen daha sonra tekrar deneyin.");
                return;
            }
        }
        
        System.out.println("******************************");
        
        String islemler = "1. Bakiye görüntüle\n"
                            + "2. Para yatırma\n"
                            + "3. Para çekme\n"
                            + "Çıkış için q'ya basınız.";
        System.out.println(islemler);
        
        System.out.println("******************************");
        
        while(true){
            System.out.print("İşlem Seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiye = " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else{
                System.out.println("Geçersiz işlem!");
            }
            
        }
    }
    
}
