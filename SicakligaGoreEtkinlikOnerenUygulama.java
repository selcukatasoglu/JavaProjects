import java.util.Scanner;
public class SicakligaGoreEtkinlikOnerenUygulama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("1.Sıcaklık 5'den küçük ise 1'i tuşlayınız.");
        System.out.println("2.Sıcaklık 5 ve 15 arasında ise 2'yi tuşlayınız.");
        System.out.println("3.Sıcaklık 15 ve 25 arasında ise 3'ü tuşlayınız.");
        System.out.println("4.Sıcaklık 25'den büyük ise 4'ü tuşlayınız.");
        int secim = input.nextInt();

        if(secim==1){
            System.out.println("Size Kayak yapmayı öneriyorum.İyi eğlenceler");
        }
        else if (secim==2){
            System.out.println("Size Sinemaya gitmeyi öneriyorum.İyi eğlenceler");
        }
        else if (secim==3){
            System.out.println("Size Pikniğe gitmeyi öneriyorum.İyi eğlenceler");
        }
        else if (secim==4){
            System.out.println("Size Yüzmeye gitmeyi öneriyorum.İyi eğlenceler");
        }
        else{
            System.out.println("Geçersiz değer girdiniz...");
        }

    }
}
