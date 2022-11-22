public class Main {
    public static void main(String[] args) {
        /*
        Abone abone = new Abone();
        
        abone.isim = "Samet";
        abone.bakiye = 200;
        abone.sehir = "Ankara";
        
        abone.dogalgazKullan(200);
        */
        
        GelismisAbone abone = new GelismisAbone("Samet", 200, "Ankara");
        
        abone.bakiyeOgren();
    }
}
