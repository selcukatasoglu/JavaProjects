import java.util.Scanner;

public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        double kdvOrani;
        double kdvliFiyat;
        double kdvTutari;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen para değerini girin: ");
        double paraDegeri = scanner.nextDouble();

        if (paraDegeri > 0 && paraDegeri <= 1000) {
            kdvOrani = 0.18; // %18 KDV
        } else {
            kdvOrani = 0.08; // %8 KDV
        }

        kdvTutari = paraDegeri * kdvOrani;
        kdvliFiyat = paraDegeri + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + paraDegeri);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}