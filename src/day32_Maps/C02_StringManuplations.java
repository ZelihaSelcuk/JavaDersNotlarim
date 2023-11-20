package day32_Maps;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C02_StringManuplations {

    public static void main(String[] args) {

        //öğrenci bilgilerini belirli formatta tutan String lerden oluşan bir listemiz var.
        // bu listeden isim verdiğimizde,
        // o isme sahip olanların isim ve soyisimlerini yazdiran bir method oluşturun


        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Beytullah-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");

        isimSoyisimYazdir(ogrenciList, "beytullah");
        subeListesiYazdir(ogrenciList, "K");
    }


    // şubesi verilen öğrencilerin isim ve soyisimlerini yazdıran bir method oluşturun.

    public static void subeListesiYazdir (List<String> ogrenciList,String sube){

        for (int i = 0; i <ogrenciList.size() ; i++) {
           String ogrenciBilgi1 = ogrenciList.get(i);
          String [] bilgiler1 =  ogrenciBilgi1.split("-");
          if (bilgiler1[3].equalsIgnoreCase(sube)){
              System.out.println(sube+" Subesinde Okuyan Öğrenci:" + " " + bilgiler1[0] + " " + bilgiler1[1] );
          }
        }


    }


    public static void isimSoyisimYazdir(List<String> ogrenciList, String istenenIsim) {

        for (int i = 0; i < ogrenciList.size(); i++) {
            String ogrenciBilgi = ogrenciList.get(i);  // her bir elementi sırayla getirecek... "Ercan-Yil-10-M-MF" hepsi tek bir element
            String[] bilgiler = ogrenciBilgi.split("-");  // [Beytullah, Yildiz, 10, K, Soz] her bir elementi sırayla bu hale dönüştürecek
            // ve bu hali bir array e atayacak
            if (bilgiler[0].equalsIgnoreCase(istenenIsim)) {   // bu array in 0. index i istenen isim ile aynıysa
                System.out.println("İsim Soyisim : " + bilgiler[0] + " " + bilgiler[1]);
            }

        }


    }
}
