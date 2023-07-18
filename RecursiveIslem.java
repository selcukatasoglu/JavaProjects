import java.util.Scanner;

import java.util.Scanner;

public class RecursiveIslem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursiveIslem(n);
    }

    // Girilen sayıdan 5 çıkarıp tekrar 5 ekleyen recursive metot
    public static void recursiveIslem(int sayi) {
        System.out.println("Son değer: " + sayi);

        if (sayi <= 0) {
            sayi += 5;
            System.out.println("Son değer: " + sayi);
            return;
        }

        sayi -= 5;
        recursiveIslem(sayi);
        sayi += 5;
        System.out.println("Son değer: " + sayi);
    }
}
