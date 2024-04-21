import java.security.SecureRandom;
import java.util.Scanner;

public class calculateShopping1 {
    public static void main(String[] args) {
        //Pc price:50000
        //Phone price: 40000
        //Tablet price: 30000
        float[] prices = {50000, 40000, 30000, 1400.500f};
        String[] products = {"pc", "phone", "tablet","monitor"};
        float total = 0.0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PRODUCTS:\nPC\nPHONE\nTABLET\nMONITOR");
        System.out.print("Which products do you want to buy: ");
        String cesit = scanner.nextLine();
        cesit = cesit.toLowerCase(); //Büyük harf girildiğinde girilen harfleri küçük harflere çevirir.


        for (int i = 0; i < products.length; i++) {
            if (cesit.contains(products[i])) {
                System.out.print("How many " + products[i] + " do you want to buy?");
                int sayi = scanner.nextInt();
                total += (sayi * prices[i]);
            }
        }

        System.out.println("Total price: "+total);

}
}