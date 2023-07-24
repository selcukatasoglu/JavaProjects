import java.util.Arrays;

public class TekrarEdenSayilarinFrekansiniBulanProgram {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        findFrequency(arr);
    }

    public static void findFrequency(int[] arr) {
        Arrays.sort(arr); // Diziyi sıralıyoruz, böylece tekrar eden elemanlar yan yana olacak.

        int n = arr.length;
        int currentElement = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == currentElement) {
                count++;
            } else {
                System.out.println(currentElement + " sayısı " + count + " kere tekrar edildi.");
                currentElement = arr[i];
                count = 1;
            }
        }

        // Döngü bittiğinde son elemanın frekansını da yazdırmamız gerekiyor.
        System.out.println(currentElement + " sayısı " + count + " kere tekrar edildi.");
    }
}
