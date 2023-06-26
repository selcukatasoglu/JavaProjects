import java.util.Scanner;

public class KombinasyonProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        int kombinasyon = calculateCombination(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    public static int calculateCombination(int n, int r) {
        int faktoriyelN = calculateFactorial(n);
        int faktoriyelR = calculateFactorial(r);
        int faktoriyelNR = calculateFactorial(n - r);

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        return kombinasyon;
    }

    public static int calculateFactorial(int num) {
        int faktoriyel = 1;
        for (int i = 2; i <= num; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
