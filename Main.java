
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        /* while döngüsü ile Atm programı 
        
        1- Bakiye Öğrenme 
        2- Para Çekme
        3- Para Yatırma
        q- ÇIKIŞ
        */
        
        System.out.println("ATM ye Hoş Geldiniz");
        String islemler =("1- Bakiye Öğrenme \n"+"2- Para Çekme \n"+"3- Para Yatırma \n"+"q- ÇIKIŞ" );
        System.out.println(islemler);
        
        Scanner scan=new Scanner(System.in);
        int bakiye =1000;
        while (true) {
            System.out.print("Yapmak İstediğiniz İşlemi Giriniz :");
            String islem=scan.nextLine();
            
            if(islem.equals("q")){
                System.out.println("İyi Günler Dileriz ");
            }
            else if(islem.equals("1")){
                System.out.println("Güncel Bakiyeniz :"+bakiye);
            }
            else if(islem.equals("2")){
                System.out.print("Lütfen Çekmek istediğiniz Tutarı Giriniz :");
                int paraCekme=scan.nextInt();
                bakiye=bakiye-paraCekme;
                scan.nextLine();
            }
            else if(islem.equals("3")){
                System.out.print("Yatırmak istediğiniz Tutarı Giriniz :");
                int paraYatırma=scan.nextInt();
                bakiye=bakiye+paraYatırma;
                scan.nextLine();
            }
            else {
                System.out.println("Lütfen Geçerli Bir Değer Giriniz !");
            
            }
            
            
        }
        
            
        }
}
