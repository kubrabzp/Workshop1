import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        //String metotlarını araştırınız. Her bir metot için örnek yapınız.

        // 1- String tanımlanması
        String myString = "Merhaba dünya";
        System.out.println("1-->" + "Metin:" + myString);

        // 2- String'e atanan metnin uzunluğunu hesaplama --> length
        System.out.println("2-->" + "Metnin uzunluğu:" + myString.length());

        // 3- Metinde istediğimiz harften itibaren yazdırma(Mesela sadece dünya
        // yazdıralım. Yani d harfinden sonrasını yazdırmamız gerekli. --> substring
        System.out.println("3-->" + myString.substring(8, myString.length()));

        // 3.1- İstediğimiz aralığı yazdırabiliriz. Mesela  0 - 7 arasındaki
        // (0 dahil 7 hariç) karakterleri yazdıralım. --> substring
        System.out.println("3.1-->" + myString.substring(0, 7));

        // 4- Bir harfin ya da String değerinin kaçıncı dizinden (index)
        // itibaren başladığını bulabiliriz. --> indexOf
        System.out.println("4-->" + "dünya baslangici " + myString.indexOf("dünya"));

        // 5- Bir metni başka bir metinle karşılaştırmak için equals ya da
        // equalsIgnoreCase metodlarını kullanabiliriz.
        if (myString.equalsIgnoreCase("merhaba dünya")){
            System.out.println("5-->" + "Aynı deger");
    }

        // 6- Bir string array'de yazılı olan metinler içerisinde arama yapabilir,
        // eşleşen varsa buldurabiliriz.
        if (myString.contains("dün")){
            System.out.println("6-->" + "myString'in içinde dün vardır:" + myString);
        }

        // 7- Bir metni küçük harflere çevirmek için toLowerCase,
        // büyük harflere çevirmek içinse toUpperCase metodlarını kullanabiliriz.
        myString = "MERHABA DÜNYA";
        System.out.println("7-->" + "Küçük harfler : " + myString.toLowerCase());

        myString = "merhaba dünya";
        System.out.println("7-->" + "Büyük harfler : " + myString.toUpperCase());

        // 8- Bir metin içerisindeki boşluklardan kurtulmak için trim metodu
        // kullanılır. trim metodu, metnin sonunda ve başında yer alan boşlukları
        // yok ederken kelime aralarındaki boşluklara dokunmaz.
        myString = "   Merhaba dünya   ";
        System.out.println("8-->" + "Bosluklar yok:" + myString.trim());

        // 9- Bir metni parçalara bölmek için (örneğin boşluklara göre ayırıp
        // kelimeleri ayıklama) split metodu kullanılır.
        myString = "Merhaba dünya";
        String[] words = myString.split(" ");
        System.out.println("9-->" + Arrays.toString(words));

    }
}