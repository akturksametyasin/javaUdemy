public class Test {
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Tamperli Cam");
        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "Windows 10");
        
        Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
        
        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getMonitor().monitoruKapat();
        bilgisayar.getAnakart().isletimSistemiYukle("Ubuntu 16.04");
        
    }
}
