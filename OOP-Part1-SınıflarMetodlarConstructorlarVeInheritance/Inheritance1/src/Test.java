public class Test {
    public static void main(String[] args) {
        
        // IS-A
        
        Yonetici yonetici1 = new Yonetici("Samet", 2500, "IT", 10);
        
        yonetici1.bilgileriGoster();
        
        yonetici1.zamYap(200);
        
    }
}
