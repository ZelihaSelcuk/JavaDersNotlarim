package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_setMetodu {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);  // [Deniz, Omer, Esra, Hamza, Basak]
        System.out.println(isimler.get(1)); //  Omer
       //  System.out.println(isimler.get(8)); //  olmayan index i getirmesini istedik.
                                            //  IndexOutOfBoundsException

        isimler.add(3,"Azim");
        System.out.println(isimler); //  [Deniz, Omer, Esra, Azim, Hamza, Basak]
                                        //  Azim i 3 ekleyip sağında kalanları kaydırdı.


        // Azim i SİLİP yerine Gülnur yapmak için  SET kullanıyoruz.  !!!
        // SET değer ataması yapar  !!!
        isimler.set(3,"Gülnur");
        System.out.println(isimler); // [Deniz, Omer, Esra, Gülnur, Hamza, Basak]

        // Esra nın yerine Yusuf u set edelim, bunu yaptıgına dair bize kanıt getirmek gibi esra yı sildim yazdırıyor java
        System.out.println(isimler.set(2, "Yusuf"));  // Esra
                                                    // bu method un asıl amacı verilen index teki elemanı değiştirmektir.
        //isimler in yeni halini yazdırırsak artık orada esra olmaz
        System.out.println(isimler);  // [Deniz, Omer, Yusuf, Gülnur, Hamza, Basak]

        isimler.set(0,"Ayça");  // bu method un asıl amacı verilen index teki elemanı değiştirmektir.
                                // yazdır demediğimiz için sildiğini yazdirmadı ve alt satırda yeni durumu yazdirdi.
                                // sonradan silinen ismi alamayız.
                                // bu satırda alırsak alıcaz, sonradan eski değere ulaşamıyoruz.
        System.out.println(isimler); //  [Ayça, Omer, Yusuf, Gülnur, Hamza, Basak]





    }
}
