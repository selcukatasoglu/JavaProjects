import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut=2.14,armutkg;
        double elma=3.67,elmakg;
        double domates=1.11,domateskg;
        double muz=0.95,muzkg;
        double patlican=5.00,patlicankg;
        double fiyat=0;

        System.out.print("Armut kaç kilo : ");
        armutkg=input.nextDouble();
        System.out.print("Elma kaç kilo : ");
        elmakg=input.nextDouble();
        System.out.print("Domates kaç kilo : ");
        domateskg=input.nextDouble();
        System.out.print("Muz kaç kilo : ");
        muzkg=input.nextDouble();
        System.out.print("Patlican kaç kilo : ");
        patlicankg=input.nextDouble();

        fiyat=(elma*elmakg)+(armut*armutkg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);

        System.out.println("Toplam fiyat : "+fiyat);


    }
}
