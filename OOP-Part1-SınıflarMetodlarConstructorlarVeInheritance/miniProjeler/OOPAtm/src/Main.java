public class Main {
    public static void main(String[] args) {
        // Object Oriented(Nesne Yönelimli) ATM Programı
        
        // Login Class'ı kullanıcı girişini kontrol edecek.
        
        // Hesap Class'ı hesap işlemlerini yapacak.
        
        // ATM Class'ı ise atmyi çalıştıracak.
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("samet", "12345", 2000);
        
        atm.calis(hesap);
        
        System.out.println("Programdan çıkılıyor...");
        
    }
}
