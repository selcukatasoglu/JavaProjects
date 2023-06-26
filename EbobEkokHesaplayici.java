import java.util.Scanner;

public class EbobEkokHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int ebob = findEBOB(sayi1, sayi2);
        int ekok = findEKOK(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    public static int findEBOB(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int temp = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = temp;
        }
        return sayi1;
    }

    public static int findEKOK(int sayi1, int sayi2) {
        int ebob = findEBOB(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        return ekok;
    }
}
