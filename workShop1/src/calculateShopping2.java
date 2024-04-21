import java.util.Scanner;

public class calculateShopping2 {
    //kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam
    // alışveriş tutarını hesaplayan bir algoritma yazınız.(Input

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("How many products do you want to buy: ");
        int cesit = scanner.nextInt();

        int total=0;
        for (int i = 1; i <= cesit; i++) {
            System.out.print(i + "." + "product name: ");
            String secim = scanner.next();
            System.out.print(secim + " price: ");
            int fiyat = scanner.nextInt();
            total +=fiyat;
        }
        System.out.println("Total price: " + total);
    }
}






