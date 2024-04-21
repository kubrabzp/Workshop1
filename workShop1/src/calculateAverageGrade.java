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

        String[] studentName = new String[numberStudent];
        String[] studentSurname = new String[numberStudent];

        float[] quizs = new float[3];

        int i = 1;

        for (i = 0; i < studentName.length; i++) {
            float total = 0.0f;
            float studentAverage = 0.0f;

            System.out.print((i + 1) + ".öğrencinin adını giriniz: ");
            studentName[i] = scanner.next();

            System.out.print((i + 1) + ".öğrencinin soyadını giriniz: ");
            studentSurname[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print((i + 1) + ".öğrencinin " + (j + 1) + ".sınav notu: ");
                quizs[j] = scanner.nextFloat();
                total += quizs[j];
            }
            studentAverage = total / 3;
            System.out.println((i + 1) + ".öğrencinin not ortalaması: " + studentAverage);
        }


    }
}