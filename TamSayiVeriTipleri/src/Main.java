
import javax.imageio.plugins.jpeg.JPEGQTable;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(Byte.MAX_VALUE);     //veri tipinin tutabileceği max değeri gösterir.
        System.out.println(Byte.MIN_VALUE);     //veri tipinin tutabileceği min değeri gösterir.
        
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        
        // Otomatik dönüştürme : byte --> short --> int --> long
        
        byte a = 100;
        byte b = (byte)(a / 2);
        
        System.out.println(b);
        
        
        short i = 100;
        byte j = 2;
        int k = 4;
        
        long d = i + j + k;
        
        System.out.println(d);
        
    }
}
