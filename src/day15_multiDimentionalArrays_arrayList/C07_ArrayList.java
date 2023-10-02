package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {
    public static void main(String[] args) {

        List<Integer>sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        System.out.println(sayilar.size()); //
        System.out.println("Liste bos mu?" + sayilar.isEmpty()); // true   ... boş  diyor


        sayilar.add(5);
        sayilar.add(0,7);
        System.out.println(sayilar);   // 7 yi sonradan ekledik ama 0. index e eklediğimiz için onu öne aldı.
        System.out.println(sayilar.size());  //2  verdi.lenght veriyor..

        // ArrayList in boş olup olmadıgını List.isEmpty ile kontrol ediyoruz.
        System.out.println("Liste bos mu?" + sayilar.isEmpty()); // false   ... boş değil diyor

        System.out.println(sayilar.contains(5)); // true
        System.out.println(sayilar.contains(3)); // false

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        System.out.println(sayilar); // [7, 5, 3, 2, 8]

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);

        // "sayilar", " rakamlar" i içeriyor mu ?  aşağıdaki gibi bakılıyor.

        System.out.println(sayilar.containsAll(rakamlar)); // true.

        rakamlar.add(9);   // sayilar da olmayan bir element ekledik.

        System.out.println(sayilar.containsAll(rakamlar)); // false   rakamların tamamını içermedği için false verdi.


    }
}
