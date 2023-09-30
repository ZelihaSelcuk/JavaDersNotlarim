package day13_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

int []arr ={4,6,1,2};

// bu array i yazdıralım

        System.out.println(arr); //  [I@6acbcfc0   referansını yazdırır

        // ayyar ler direkt yazdırılamaz
        // direkt yazdırmak isterseniz array i değil referansını yazdırır.

        // array i yazdırmak için Arrays class ından yardım almalıyız.

        System.out.println(Arrays.toString(arr));//[4, 6, 1, 2] bu şekilde yazdırır.

        //element  virgül boşluk şeklinde ,
        // //araya kaç tane boşluk koyarsak koyalım yazdırırken java, element virgül boşluk şeklinde yazdırır.

        String[]kelimeler={"Ali", ", okula","gitti"};
        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2]

        // array in tüm elementlerini yazdırın.
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("===================");
        // ya da bir for döngüsü oluşturucaz.

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        // biz ne zaman array in tüm elementleri ile ilgili bir iş yapmak istesek
            // bir for loop oluşturup arr[i] kullanıcaz.
            // arr[i]  BİZİM OĞLAN






        }



    }
}
