public class Main {

    public static void main(String[] args) {
        
        /*
        
        Mantıksal Operatörler
        
        && --> and operatörü
        Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.
        
        || --> or operatörü
        Sonuçlardan en az birisi bile true ise gneel sonuç ture, hepsi false ise genel sonuç false olur.
        
        ! --> not operatörü
        
        */
        
        System.out.println( 3 == 3);
        System.out.println(2 < 3);
        System.out.println("Murat" == "Murat");
        System.out.println(3 == 3 && 2 < 3 && "Murat" == "Murat");
        System.out.println(3 != 3 || 2 > 3 || "Murat" != "Murat");
        System.out.println(!(3 < 4));
        System.out.println(!((3 < 4 && "Murat" != "Murat") || 3.4 > 2.1));
        
    }
    
}
