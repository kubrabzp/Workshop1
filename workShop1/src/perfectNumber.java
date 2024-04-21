import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        // Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

        // Mükemmel sayı: Tam sayıların pozitif bölenleri toplamı, sayının kendisinin
        // iki katına eşitse bu sayı mükemmel sayıdır.
        // Örnek: 6 sayısının pozitif bölenleri = 1,2,3,6 - 6+3+2+1=12 6*2=12

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Girdiğiniz değer negatiftir. Lütfen pozitif değer giriniz!");
            return;
        }

        System.out.print("Sayının pozitif bölenleri: ");

        int total =0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.print(i + ",");
                total += i;
            }
        }
        if (total == number * 2){
            System.out.println("\n" + number + " sayısı mükemmel sayıdır!");
        }
        else {
            System.out.println("\n" + number + " sayısı mükemmel sayı değildir!");
        }

    }
}