public class Calisan {  // Superclass veya BaseClass
    
    private String isim;
    private int maas;
    private String departman;
    
    
    public Calisan(String isim, int maas, String departman){
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
    public void calis(){
        System.out.println("Çalışan çalışıyor...");
    }
    
    public void bilgileriGoster(){
        System.out.println("İsim : " + isim);
        System.out.println("Maaş : " + maas);
        System.out.println("Departman : " + departman);
    }
    
    public void departmanDegistir(String yeniDepartman){
        System.out.println("Departman değiştiriliyor.");
        this.departman = yeniDepartman;
        System.out.println("Yeni departman : " + this.departman);
    }
    
}
