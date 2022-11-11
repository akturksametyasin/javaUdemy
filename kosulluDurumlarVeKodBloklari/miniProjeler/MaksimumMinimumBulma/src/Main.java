
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Kullanıcıdan alınan 3 sayıdan en büyük sayıyı bulma
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1. Sayı : ");
        int a = scanner.nextInt();
        
        System.out.print("2. Sayı : ");
        int b = scanner.nextInt();
        
        System.out.print("3. Sayı : ");
        int c = scanner.nextInt();
        
        int maks;
        if(a >= b && a >= c){
            maks = a;
        }
        else if(b >= a && b >= c){
            maks = b;
        }
        else{
            maks = c;
        }
        
        System.out.println("En büyük sayı : " + maks);
        
        int min;
        if(a <= b && a <= c){
            min = a;
        }
        else if(b <= a && b <= c){
            min = b;
        }
        else{
            min = c;
        }
        
        System.out.println("En küçük sayı : " + min);
        
    }
    
}
