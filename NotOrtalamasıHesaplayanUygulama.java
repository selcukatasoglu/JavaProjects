import java.util.Scanner;
public class NotOrtalamasıHesaplayanUygulama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;
        int sonuc;

        System.out.print("Matematik notunuzu giriniz : ");
        matematik=input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya=input.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih=input.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik=input.nextInt();

        sonuc=(matematik+fizik+kimya+turkce+tarih+muzik)/6;

        if(sonuc<60){
            System.out.println("Sınıfta Kaldı");
        }
        else{
            System.out.println("Sınıfı Geçti");
        }

    }

}
