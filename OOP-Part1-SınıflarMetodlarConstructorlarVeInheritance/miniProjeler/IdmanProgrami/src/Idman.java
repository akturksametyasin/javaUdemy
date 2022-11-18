public class Idman {
    private int burpeeSayisi;
    private int pushUpSayisi;
    private int sitUpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int pushUpSayisi, int sitUpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.sitUpSayisi = sitUpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    
    public void hareketYap(String hareketTuru, int hareketSayisi){
        if(hareketTuru.equals("Burpee")){
            burpeeYap(hareketSayisi);
        }
        else if(hareketTuru.equals("PushUp")){
            pushUpYap(hareketSayisi);
        }
        else if(hareketTuru.equals("SitUp")){
            sitUpYap(hareketSayisi);
        }
        else if(hareketTuru.equals("Squat")){
            squatYap(hareketSayisi);
        }
        else{
            System.out.println("Geçersiz hareket!");
        }
    }
    
    public void burpeeYap(int hareketSayisi){
        if(burpeeSayisi == 0){
            System.out.println("Yapacak burpee kalmadı.");
        }
        if(burpeeSayisi - hareketSayisi < 0){
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler!");
            burpeeSayisi = 0;
            System.out.println("Kalan Burpee : " + burpeeSayisi);
        }
        else{
            burpeeSayisi -= hareketSayisi;
            System.out.println("Kalan Burpee : " + burpeeSayisi);
        }
    }
    
    public void pushUpYap(int hareketSayisi){
        if(pushUpSayisi == 0){
            System.out.println("Yapacak push up kalmadı.");
        }
        if(pushUpSayisi - hareketSayisi < 0){
            System.out.println("Hedeflediğin push up sayısını geçtin. Tebrikler!");
            pushUpSayisi = 0;
            System.out.println("Kalan PushUp : " + pushUpSayisi);
        }
        else{
            pushUpSayisi -= hareketSayisi;
            System.out.println("Kalan PushUp : " + pushUpSayisi);
        }
    }
    
    public void sitUpYap(int hareketSayisi){
        if(sitUpSayisi == 0){
            System.out.println("Yapacak sit up kalmadı.");
        }
        if(sitUpSayisi - hareketSayisi < 0){
            System.out.println("Hedeflediğin sit up sayısını geçtin. Tebrikler!");
            sitUpSayisi = 0;
            System.out.println("Kalan Sit Up : " + sitUpSayisi);
        }
        else{
            sitUpSayisi -= hareketSayisi;
            System.out.println("Kalan Sit Up : " + sitUpSayisi);
        }
    }
    
    public void squatYap(int hareketSayisi){
        if(squatSayisi == 0){
            System.out.println("Yapacak squat kalmadı.");
        }
        if(squatSayisi - hareketSayisi < 0){
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler!");
            squatSayisi = 0;
            System.out.println("Kalan Squat : " + squatSayisi);
        }
        else{
            squatSayisi -= hareketSayisi;
            System.out.println("Kalan Squat : " + squatSayisi);
        }
    }
    
    public boolean idmanBittiMi(){
        return((burpeeSayisi == 0) && (pushUpSayisi == 0) && (sitUpSayisi == 0) && (0 == squatSayisi));
    }
    
}
