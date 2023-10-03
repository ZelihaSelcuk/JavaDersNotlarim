package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {
    public static void main(String[] args) {

       // Verilen bir tamsayıyı tam bölebilen pozitif tamsayilari
        // bir liste olarak bize döndüren bir method oluşturun.

        int sayi ;
        System.out.println(tamBolenlerListesi(30));
    }
    public static List<Integer> tamBolenlerListesi (int sayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();
        tamBolenlerListesi.add(1); // 1 kesin tam böldüğü için en başta ekledik,
                                    // eklemeyip for un içinda tespit edilmesini de tercih edebilirsdik.
        for (int i = 2; i < sayi ; i++) {
            if(sayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
            return tamBolenlerListesi;
    }
}
