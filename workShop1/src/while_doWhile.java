public class while_doWhile {
    public static void main(String[] args) {
        // Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

//while döngüsünde koşula bakılır, sağlanmadığı için döngüye giremez.
        int i = 5;
        while (i < 5) {
            System.out.print(i + ",");
            i++;
        }
        System.out.println("\n" + "----------");


//do-while döngüsünde koşula bakılmadan döngüye girer 1 kez çalıştırılır sonra koşula bakılır.
        int j = 5;
        do {
            System.out.println(j + ",");
            j++;
        } while (j < 5);
    }
}