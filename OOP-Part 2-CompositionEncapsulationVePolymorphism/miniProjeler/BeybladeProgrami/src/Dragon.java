public class Dragon extends Beyblade {
    
    private String kutsalCanavar;
    private String gizliYetenek;
    
    public Dragon(String beybladeci, int donusHizi, int saldiriGücü, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGücü);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + "'in Saldırısı : Hayalet Kasırgası");
    } 
    
}