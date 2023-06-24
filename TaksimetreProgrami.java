import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kmFiyatı = 2.20;
        double taksimetreAcilis=10;
        double fiyat=0;
        double kilometre = 0;

        System.out.println("Gidilecek km mesafesi : ");
        kilometre=input.nextDouble();
        fiyat = (kmFiyatı*kilometre)+taksimetreAcilis;

        if(fiyat<20){
            System.out.println("Fiyat 20 Tlden düşük olduğu için hesaplama yapılamaz");
        }
        else{
            System.out.println("Fiyat : "+fiyat);
        }
    }
}
