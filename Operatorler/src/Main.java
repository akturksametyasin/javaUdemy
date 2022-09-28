public class Main {

    public static void main(String[] args) {
        
        /*
        
        + ---> Toplama Operatörü
        - ---> Çıkarma Operatörü
        / ---> Bölme Operatörü
        * ---> Çarpma Operatörü
        % ---> Kalan Operatörü
        
        */
        
        
        System.out.println( 3 + 4.2 );
        System.out.println( 3 - 5f );
        System.out.println( 10 / 4.0 );
        System.out.println( 3 * 4.5 );
        System.out.println( 10 % 4 );
  
        
        int a = 7;
        System.out.println(a++);        //postfix eğer bu şekilde yazarsak a değişkeni güncellenmeden gösterilir.
        System.out.println(++a);        //prefix bu şekilde yazarsak ise a değişkeni ilk önce 1 arttırılır sonra gösterilir.
        System.out.println((3f / 4) + (4 * 5));
        
        int b = 8;
        System.out.println(b+=10);      //b+=10 --> b = b + 10
        
        
    }
}
