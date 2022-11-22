// Doğalgaz abonesi
public class Abone {
    
    public String isim;
    public int bakiye;
    public String sehir;
    
    public void dogalgazKullan(int miktar){
        if(this.bakiye - miktar < 0){
            System.out.println("Yeterli bakiye yok!");
        }
        else{
            this.bakiye -= miktar;
            
            if(this.bakiye <= 0){
                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone"
                        + " merkezine giderek kredi yükleyin."
                        + " Kredi Limiti = 120 TL");
            }
            else{
                System.out.println("Yeni bakiye = " + bakiye);
            }
        }
    }
    
    public void bakiyeOgren(){
        System.out.println("Bakiye = " + bakiye);
    }
    
}
