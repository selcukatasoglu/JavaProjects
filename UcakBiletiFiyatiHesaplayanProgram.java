import java.util.Scanner;

public class UcakBiletiFiyatiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = sc.nextInt();

        System.out.print("Yaşınız: ");
        int yas = sc.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = sc.nextInt();

        double birimFiyat = 0.10;
        double toplamFiyat = mesafe * birimFiyat;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8;// %20 indirim
                toplamFiyat*=2;
            }

            System.out.println("Toplam Bilet Fiyati: " + toplamFiyat);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        sc.close();
    }
}
