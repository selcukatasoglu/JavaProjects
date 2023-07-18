import java.util.Scanner;

public class UsAlmaRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }

    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        } else if (us % 2 == 0) {
            int yarisi = usAlma(taban, us / 2);
            return yarisi * yarisi;
        } else {
            int yarisi = usAlma(taban, (us - 1) / 2);
            return taban * yarisi * yarisi;
        }
    }
}
