import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DikUcgendeHipotenusBulanPorgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1,kenar2;

        System.out.print("Lütfen birinci kenarı giriniz : ");
        kenar1=input.nextInt();
        System.out.print("Lütfen ikinci kenarı giriniz : ");
        kenar2=input.nextInt();

        double kenar3= (double) sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Üçgenin hipotenüsü : "+kenar3);
        System.out.println("Üçgenin alanı : "+(kenar1*kenar2)/2);




    }
}
