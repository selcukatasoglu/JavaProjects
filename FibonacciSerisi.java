import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        int sayi1 = 0;
        int sayi2 = 1;

        System.out.print(sayi1 + " " + sayi2 + " ");

        for (int i = 3; i <= elemanSayisi; i++) {
            int sonrakiSayi = sayi1 + sayi2;
            System.out.print(sonrakiSayi + " ");

            sayi1 = sayi2;
            sayi2 = sonrakiSayi;
        }
    }
}
