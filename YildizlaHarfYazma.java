public class YildizlaHarfYazma {
    public static void main(String[] args) {
        int size = 7; // "B" harfinin boyutu, istediğiniz boyutu değiştirebilirsiniz

        char[][] letterB = new char[size][size];

        // Harf "B" nin oluşturulması
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (col == 0 || row == 0 || row == size - 1 || row == size / 2 || col == size - 1 && row != size / 2) {
                    letterB[row][col] = '*';
                } else {
                    letterB[row][col] = ' ';
                }
            }
        }

        // Harf "B" nin ekrana yazdırılması
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(letterB[row][col] + " ");
            }
            System.out.println();
        }
    }
}
