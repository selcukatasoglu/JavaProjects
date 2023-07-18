import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }

    // Bir sayının palindrom olup olmadığını kontrol eden fonksiyon
    public static boolean isPalindrom(int sayi) {
        int tersi = 0;
        int temp = sayi;

        while (temp != 0) {
            int kalan = temp % 10;
            tersi = tersi * 10 + kalan;
            temp /= 10;
        }

        return sayi == tersi;
    }
}
