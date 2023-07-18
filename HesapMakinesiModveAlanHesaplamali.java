
import java.util.Scanner;

public class  HesapMakinesiModveAlanHesaplamali{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("**** HESAP MAKİNESİ ****");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("5. Mod Alma");
            System.out.println("6. Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0. Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçin (0-6): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamaIslemi();
                    break;
                case 2:
                    cikarmaIslemi();
                    break;
                case 3:
                    carpmaIslemi();
                    break;
                case 4:
                    bolmeIslemi();
                    break;
                case 5:
                    modAlmaIslemi();
                    break;
                case 6:
                    dikdortgenIslemi();
                    break;
                case 0:
                    System.out.println("Hesap makinesi kapatılıyor. İyi günler!");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 0);
    }

    public static void toplamaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplama işlemi için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Toplama işlemi için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double sonuc = sayi1 + sayi2;
        System.out.println("Sonuç: " + sonuc);
    }

    public static void cikarmaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıkarma işlemi için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çıkarma işlemi için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double sonuc = sayi1 - sayi2;
        System.out.println("Sonuç: " + sonuc);
    }

    public static void carpmaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpma işlemi için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Çarpma işlemi için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double sonuc = sayi1 * sayi2;
        System.out.println("Sonuç: " + sonuc);
    }

    public static void bolmeIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölme işlemi için ilk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Bölme işlemi için ikinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        if (sayi2 != 0) {
            double sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        } else {
            System.out.println("Bir sayıyı 0'a bölemezsiniz!");
        }
    }

    public static void modAlmaIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mod alma işlemi için ilk sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Mod alma işlemi için ikinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int sonuc = sayi1 % sayi2;
        System.out.println("Sonuç: " + sonuc);
    }

    public static void dikdortgenIslemi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double kisaKenar = scanner.nextDouble();

        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }
}
