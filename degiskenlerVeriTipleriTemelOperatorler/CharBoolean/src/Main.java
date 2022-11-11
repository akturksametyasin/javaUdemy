public class Main {
    
    public static void main(String[] args) {
        
        // Char Veri Tipi : Karakterleri göstermek için kullanılır. 2 byte yer kaplar. 2^16 tane karakter simgelenebilir.
        // Boolean Veri Tipi : Koşul durumlarında kullanılır. true veya false değerini alır.
        
        
        char a = 'A';
        char b = '?';
        char c = 1250;      // 1250 sayısına karşılık gelen karakteri gösterir.
        char d = '\u272F';      // unicode table'dan bulduğumuz kodu(U+272F) -> '\u272F' şeklinde yazarak bu koda karşılık gelen sembolü gösterebiliriz.
        char e = '\u24DA';
       
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        
        boolean f = true;
        boolean g = false;
        
        System.out.println(f);
        
    }
    
}
