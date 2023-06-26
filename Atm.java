import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000; // Başlangıç bakiyesi
        int islem;

        while (true) {
            System.out.println("ATM'ye hoş geldiniz!");
            System.out.println("1. Bakiye sorgulama");
            System.out.println("2. Para çekme");
            System.out.println("3. Para yatırma");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
            islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    int cekilenMiktar = scanner.nextInt();

                    if (cekilenMiktar > bakiye) {
                        System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + bakiye + " TL");
                    } else {
                        bakiye -= cekilenMiktar;
                        System.out.println("Para çekme işlemi gerçekleştirildi. Güncel bakiyeniz: " + bakiye + " TL");
                    }
                    break;
                case 3:
                    System.out.print("Yatırmak istediğiniz miktarı girin: ");
                    int yatirilanMiktar = scanner.nextInt();

                    bakiye += yatirilanMiktar;
                    System.out.println("Para yatırma işlemi gerçekleştirildi. Güncel bakiyeniz: " + bakiye + " TL");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz işlem!");
            }

            System.out.println();
        }
    }
}
