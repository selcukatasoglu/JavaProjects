import java.util.Arrays;
import java.util.Scanner;

public class DizidekiMaxveMineYakinDegerBulanProgram {

    public static int findClosestSmaller(int[] arr, int num) {
        int closestSmaller = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < num && i > closestSmaller) {
                closestSmaller = i;
            }
        }

        return closestSmaller;
    }

    public static int findClosestLarger(int[] arr, int num) {
        int closestLarger = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > num && i < closestLarger) {
                closestLarger = i;
            }
        }

        return closestLarger;
    }

    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int num = scanner.nextInt();

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(array);

        // Girilen sayıdan küçük en yakın sayıyı buluyoruz
        int closestSmaller = findClosestSmaller(array, num);

        // Girilen sayıdan büyük en yakın sayıyı buluyoruz
        int closestLarger = findClosestLarger(array, num);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);

        scanner.close();
    }
}
