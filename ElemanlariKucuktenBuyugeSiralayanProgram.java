import java.util.Arrays;
import java.util.Scanner;

public class ElemanlariKucuktenBuyugeSiralayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            arr[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(arr);

        System.out.print("Sıralama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
