public class TekrarEdenSayi {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 4, 9, 10, 5, 11};

        System.out.println("Tekrar eden çift sayılar:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}
