import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b;
        int secim;

        System.out.println("Lütfen birinci sayıyı giriniz : ");
        a = input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        b = input.nextDouble();


        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        secim= input.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Toplama işleminin sonucu : "+(a+b));
                break;

            case 2 :
                System.out.println("Çıkarma işleminin sonucu : " + (a-b));
                break;

            case 3 :
                System.out.println("Çarpma işleminin sonucu : "+(a*b));
                break;

            case 4 :
                System.out.println("Bölme işleminin sonucu : "+(a/b));
                break;

            default:
                System.out.println("Hatalı sayı girdiniz...");
                break;
        }

    }
}
