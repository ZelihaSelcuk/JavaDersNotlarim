package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); //[]

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 8, 3]

        sayilar.add(6);
        sayilar.add(9); // bastan uzunluk verilemiyor,
                    // elemanlar tek tek ekleniyor ve tek eklendikçe uzunluk oluşuyor.

        System.out.println(sayilar); // [5, 8, 3, 6, 9]

        // sayıyı atraya yazabiliyor muyuz , EVET, aşağıdaki gibi

        sayilar.add(3,17);
        System.out.println(sayilar); // [5, 8, 3, 17, 6, 9]
        // eklediğimiz elemanı yeni yerleştirdi,onun sağındakileri bir saga kaydırdı
        // araya kaynak yapıyor yani :)

        List<Integer>rakamlar=new ArrayList<>();

        rakamlar.add(1);
        rakamlar.add(2);
        System.out.println(rakamlar); //[1, 2]

        //"rakamlar"ın sonuna "sayilar" ı ekleyebiliriz aşağıdaki gibi..
        //"addAll"  ile
        rakamlar.addAll(sayilar);
        System.out.println(rakamlar);  // [1, 2, 5, 8, 3, 17, 6, 9]


        //belirlediğimiz bir index e bütün "sayilar" listesini getirebilir aşağıdaki bigi..
        // istediğimiz index e sayi eklemek gibi araya kaynak yapıyor,
        // "rakamlar" ın kaynaktan sonraki kısmını  sağa kaydırıyor.

        rakamlar.addAll(1,sayilar);
        System.out.println(rakamlar); // [1, 5, 8, 3, 17, 6, 9, 2, 5, 8, 3, 17, 6, 9]






    }
}
