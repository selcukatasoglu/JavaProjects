import java.util.Scanner;

public class HarmonikOrtalama {

    public static double harmonicMean(double[] numbers) {
        double harmonicSum = 0;

        // Elemanların terslerini alıp toplamı bulma
        for (double number : numbers) {
            harmonicSum += 1 / number;
        }

        // Eleman sayısına bölerek harmonik ortalamayı bulma
        double harmonicMean = numbers.length / harmonicSum;
        return harmonicMean;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];

        System.out.println("Sayıları giriniz:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Harmonik ortalamayı hesaplayıp ekrana yazdırma
        double result = harmonicMean(numbers);
        System.out.println("Harmonik Ortalama: " + result);

        scanner.close();
    }
}
