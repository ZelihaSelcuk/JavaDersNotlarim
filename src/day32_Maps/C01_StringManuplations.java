package day32_Maps;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_StringManuplations {
    public static void main(String[] args) {

        // bir öğrencinin bilgileri arada tire olarak String bir variable a atanmistir.
        // isim-soyisim-sınıf-şube-bölüm
        // bu formatta verilen bilgiden  yazdıran bir method oluşturun.

        String bilgi="Ali Cem-Yildiz-10-K-Soz";
        subeYazdir(bilgi);
        isimYazdir(bilgi);
        bolumYazdir(bilgi);
    }

    public static void bolumYazdir (String bilgi){
        String[]bilgilerArr = bilgi.split("-");
        // System.out.println(Arrays.toString(bilgilerArr)); // [Ali Cem, Yildiz, 10, K, Soz]
        System.out.println("Öğrenci Bölüm:" + bilgilerArr[4]);
    }
    public static void subeYazdir(String bilgi) {
        String [] bilgilerArr=bilgi.split("-");
        System.out.println("öğrenci sube:" + bilgilerArr[3]);
    }
    public static void isimYazdir(String bilgi) {
        String [] bilgilerArr=bilgi.split("-");
        System.out.println("öğrenci isim:" + bilgilerArr[0]);
    }
}
