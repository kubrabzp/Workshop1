import java.util.Scanner;
import java.util.Random;

public class guessRandomNumber {
    public static void main(String[] args) {
        //Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen
        //ve doğru tahmin edene kadar devam eden bir program yazınız.
        // (While döngüsü ile yapınız ve rastgele sayı üretmek için Random
        // kütüphanesini kullanınız)

        Scanner scanner = new Scanner(System.in);
        Random r=new Random(); //random sınıfı
        int random = (int)(Math.random()*10); //1 ile 10 arasında random değer üretir.
        System.out.println("1 ile 10 arasında bir sayı tahmin ediniz.");

        int i = 1;
        while (i < 10) {
            System.out.print(i + ".tahmin edilen sayı:");
            int tahmin = scanner.nextInt();

            if (tahmin == random) {
                System.out.println("Random seçilen sayı:" + random + " - Tahmin edilen sayı:" + tahmin);
                System.out.println("Tebrikler " + i + ".tahminde doğru tahmin etttiniz...");
                return;
            } else {
                System.out.println("Tahmin edilen sayı doğru değil.Tekrar deneyiniz.");
            }
            i++;
        }

}}