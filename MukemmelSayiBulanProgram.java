import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        boolean mukemmel = isMukemmelSayi(sayi);

        if (mukemmel) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }

    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return (toplam == sayi);
    }
}
