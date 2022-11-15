
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samet
 */
public class Main {
    
    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya çalışın.
    Toplama ve Çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    */
    
    public static int cikarma(int a, int b){
        return (a - b);
    }
    public static double bolme(int a, int b){
        return ((double)a / b);
    }
    public static int toplama(int a, int b){
        return (a + b);
    }
    public static int toplama(int a, int b, int c){
        return (a + b + c);
    }
    public static int carpma(int a, int b){
        return (a * b);
    }
    public static int carpma(int a, int b, int c){
        return (a * b * c);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1. Toplama İşlemi\n"
                          + "2. Çıkarma İşlemi\n"
                          + "3. Çarpma İşlemi\n"
                          + "4. Bölme İşlemi\n"
                          + "Çıkış için q ya basınız.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");
        
        while(true){
            System.out.print("İşlemi seçiniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("*************************************");
                System.out.println("Programdan çıkılıyor...");
                System.out.println("*************************************");
                break;
            }
            
            else if(islem.equals("1")){
                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3) : ");
                int kacSayi = scanner.nextInt();
                
                if(kacSayi == 2){
                    System.out.print("1. Sayıyı Giriniz : ");
                    int a = scanner.nextInt();
                    
                    System.out.print("2. Sayıyı Giriniz : ");
                    int b = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("*************************************");
                    System.out.println(a + " + " + b + " = " + toplama(a, b));
                    System.out.println("*************************************");
                }
                else if(kacSayi == 3){
                    System.out.print("1. Sayıyı Giriniz : ");
                    int a = scanner.nextInt();
                    
                    System.out.print("2. Sayıyı Giriniz : ");
                    int b = scanner.nextInt();
                    
                    System.out.print("3. Sayıyı Giriniz : ");
                    int c = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("*************************************");
                    System.out.println(a + " + " + b + " + " + c + " = " + toplama(a, b, c));
                    System.out.println("*************************************");
                }
                else{
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
            }
            
            else if(islem.equals("2")){
                System.out.print("1. Sayıyı Giriniz : ");
                int a = scanner.nextInt();
                    
                System.out.print("2. Sayıyı Giriniz : ");
                int b = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.println("*************************************");
                System.out.println(a + " - " + b + " = " + cikarma(a, b));
                System.out.println("*************************************");
            }
            
            else if(islem.equals("3")){
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3) : ");
                int kacSayi = scanner.nextInt();
                
                if(kacSayi == 2){
                    System.out.print("1. Sayıyı Giriniz : ");
                    int a = scanner.nextInt();
                    
                    System.out.print("2. Sayıyı Giriniz : ");
                    int b = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("*************************************");
                    System.out.println(a + " x " + b + " = " + carpma(a, b));
                    System.out.println("*************************************");
                }
                else if(kacSayi == 3){
                    System.out.print("1. Sayıyı Giriniz : ");
                    int a = scanner.nextInt();
                    
                    System.out.print("2. Sayıyı Giriniz : ");
                    int b = scanner.nextInt();
                    
                    System.out.print("3. Sayıyı Giriniz : ");
                    int c = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("*************************************");
                    System.out.println(a + " x " + b + " x " + c + " = " + carpma(a, b, c));
                    System.out.println("*************************************");
                }
                else{
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                }
            }
            
            else if(islem.equals("4")){
                System.out.print("1. Sayıyı Giriniz : ");
                int a = scanner.nextInt();
                    
                System.out.print("2. Sayıyı Giriniz : ");
                int b = scanner.nextInt();
                
                scanner.nextLine();
                
                System.out.println("*************************************");
                System.out.println(a + " / " + b + " = " + bolme(a, b));
                System.out.println("*************************************");
            }
            
            else{
                System.out.println("*************************************");
                System.out.println("Geçersiz işlem!");
                System.out.println("*************************************");
            }
            
        }
        
    }
}
