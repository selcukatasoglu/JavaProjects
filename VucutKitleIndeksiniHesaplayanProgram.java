import java.util.Scanner;
public class VucutKitleIndeksiniHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double boy,kilo;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= input.nextDouble();

        System.out.print("Vücut kitle indeksiniz : "+(kilo/(boy*boy)));


    }
}
