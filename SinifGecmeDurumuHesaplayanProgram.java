import java.util.Scanner;

public class SinifGecmeDurumuHesaplayanProgram{
    public static void main(String[] args) {

        int gecmeNotu = 55;
        double toplamNot = 0;
        int gecerliDersSayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        double matematikNotu = input.nextDouble();
        if (matematikNotu >= 0 && matematikNotu <= 100) {
            toplamNot += matematikNotu;
            gecerliDersSayisi++;
        }
        else{
            System.out.println("Geçerli bir not girilmedi.Ders ortalamaya katılmayacaktır.");
        }

        System.out.print("Fizik notunu girin: ");
        double fizikNotu = input.nextDouble();
        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplamNot += fizikNotu;
            gecerliDersSayisi++;
        }
        else{
            System.out.println("Geçerli bir not girilmedi.Ders ortalamaya katılmayacaktır.");
        }

        System.out.print("Türkçe notunu girin: ");
        double turkceNotu = input.nextDouble();
        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplamNot += turkceNotu;
            gecerliDersSayisi++;
        }
        else{
            System.out.println("Geçerli bir not girilmedi.Ders ortalamaya katılmayacaktır.");
        }

        System.out.print("Kimya notunu girin: ");
        double kimyaNotu = input.nextDouble();
        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplamNot += kimyaNotu;
            gecerliDersSayisi++;
        }
        else{
            System.out.println("Geçerli bir not girilmedi.Ders ortalamaya katılmayacaktır.");
        }

        System.out.print("Müzik notunu girin: ");
        double muzikNotu = input.nextDouble();
        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplamNot += muzikNotu;
            gecerliDersSayisi++;
        }
        else{
            System.out.println("Geçerli bir not girilmedi.Ders ortalamaya katılmayacaktır.");
        }

        if (gecerliDersSayisi > 0) {
            double ortalama = toplamNot / gecerliDersSayisi;
            if (ortalama >= gecmeNotu) {
                System.out.println("Tebrikler, ortalama geçme notunu geçti!");
            } else {
                System.out.println("Maalesef, ortalama geçme notunu geçemedi.");
            }
        } else {
            System.out.println("Girilen ders notları geçerli değil.");
        }
    }
}
