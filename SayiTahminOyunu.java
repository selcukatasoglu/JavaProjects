import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber) + 1;
        int userGuess;
        int attempts = 0;

        System.out.println("0-100 arasında bir sayıyı tahmin et.");

        do {
            System.out.print("Tahmininiz: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Tebrikler! " + attempts + ". denemede doğru sayıyı buldunuz.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Daha büyük bir sayı tahmin edin.");
            } else {
                System.out.println("Daha küçük bir sayı tahmin edin.");
            }
        } while (true);
    }
}
