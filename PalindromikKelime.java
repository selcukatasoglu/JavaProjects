import java.util.Scanner;

public class PalindromikKelime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelimeyi giriniz: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " kelimesi palindromik bir kelimedir.");
        } else {
            System.out.println(word + " kelimesi palindromik bir kelime değildir.");
        }
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
