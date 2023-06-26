import java.util.Scanner;

public class CiftSayilarToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Bir sayı girin (Çıkmak için 0): ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
