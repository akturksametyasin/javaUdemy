public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldiriGücü;

    public Beyblade(String beybladeci, int donusHizi, int saldiriGücü) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGücü = saldiriGücü;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGücü() {
        return saldiriGücü;
    }

    public void setSaldiriGücü(int saldiriGücü) {
        this.saldiriGücü = saldiriGücü;
    }
    
    public void saldir(){
        System.out.println(beybladeci + " " + saldiriGücü + " ve " + donusHizi + " ile saldırıyor...");
    }
    
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    
    public void bilgileriGoster(){
        System.out.println("Beybladeci İsmi : " + beybladeci);
        System.out.println("Saldırı Gücü : " + saldiriGücü);
        System.out.println("Dönüş Hızı : " + donusHizi);
    }
    
}
