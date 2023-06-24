import java.util.Scanner;
public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,pi=3.14;
        int aciOlcusu;
        double alan=0;

        System.out.print("R degerini giriniz : ");
        r= input.nextDouble();
        System.out.print("Açı degerini giriniz : ");
        aciOlcusu= input.nextInt();

        alan=(pi * (r*r) * aciOlcusu) / 360;

        System.out.println("Dairenin Alanı : "+alan);


    }
}
