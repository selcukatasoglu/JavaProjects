import java.util.Scanner;

public class SifreOtomati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Java";
        String sifre = "java123";
        String kullaniciAdigiris = "";
        String sifregiris = "";
        int secim = 0;
        boolean devam = true;

        while (devam) {
            System.out.print("Lütfen kullanıcı adınızı giriniz (bitirmek için 'bitir' yazın): ");
            kullaniciAdigiris = input.nextLine();

            if (kullaniciAdigiris.equalsIgnoreCase("bitir")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }

            System.out.print("Lütfen şifrenizi giriniz: ");
            sifregiris = input.nextLine();

            if (kullaniciAdi.equals(kullaniciAdigiris)) {
                if (sifre.equals(sifregiris)) {
                    System.out.println("Giriş başarılı...");
                } else {
                    System.out.println("Hatalı şifre girdiniz, değiştirmek ister misiniz? EVET:1 / HAYIR:2");
                    secim = Integer.parseInt(input.nextLine());
                    if (secim == 1) {
                        System.out.print("Yeni şifrenizi giriniz: ");
                        sifregiris = input.nextLine();
                        if (sifregiris.equals(sifre)) {
                            System.out.println("Eski şifrenizle aynı şifreyi girdiniz. Lütfen daha sonra tekrar deneyiniz.");
                        } else {
                            sifre = sifregiris;
                            System.out.println("Şifreniz başarıyla güncellendi.");
                        }
                    } else if (secim == 2) {
                        System.out.println("İyi günler...");
                    } else {
                        System.out.println("Hatalı işlem yaptınız, program sonlandırılıyor...");
                        break;
                    }
                }
            } else {
                System.out.println("Girdiğiniz bilgiler hatalı. Şifrenizi değiştirmek istiyorsanız kullanıcı adınızı doğru yazarak tekrar deneyiniz.");
            }
        }
    }
}
