import java.util.Scanner;

public class calculateAverageGrade {
    public static void main(String[] args) {
        //Kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci
        //soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not
        //ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz:");
        int numberStudent = scanner.nextInt();
        scanner.nextLine();

        String[] ogrName = new String[numberStudent];
        String[] ogrSurname = new String[numberStudent];

        int[] quizs = new int[3];

        int i = 1;

        for (i = 0; i < ogrName.length; i++) {
            int total = 0;
            int ogrAverage = 0;

            System.out.print((i + 1) + ".öğrencinin adını giriniz: ");
            ogrName[i] = scanner.next();

            System.out.print((i + 1) + ".öğrencinin soyadını giriniz: ");
            ogrSurname[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print((i + 1) + ".öğrencinin " + (j + 1) + ".sınav notu: ");
                quizs[j] = scanner.nextInt();
                total += quizs[j];
            }
            ogrAverage = total / 3;
            System.out.println((i + 1) + ".öğrencinin not ortalaması: " + ogrAverage);
        }


    }
}