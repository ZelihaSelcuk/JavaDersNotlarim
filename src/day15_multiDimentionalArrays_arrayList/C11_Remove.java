package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);  // [Deniz, Omer, Esra, Hamza, Basak]

        // silmek istiyorum

        System.out.println(isimler.remove("Esra"));   // treu
        // bu satır esra yı silecek ve delilö olarak da bana true getirecek yani esrayı sildi diyor.
        // alt satırda yeni hali yazdırırsak artık esra olmayacak.

        System.out.println(isimler); // [Ayça, Omer, Yusuf, Gülnur, Hamza, Basak]  //listenin yeni hali

        System.out.println(isimler.remove("Ercan")); // False
        // listede olmayan bir ismi silmesini istersek ?
        // bulamadığı için silemedi ve FALSE döner.
        System.out.println(isimler); //   [Ayça, Omer, Yusuf, Gülnur, Hamza, Basak]

        System.out.println(isimler.remove(2));  // Hamza
        System.out.println(isimler); // [Deniz, Omer, Basak]

        isimler.add("İbrahim");
        isimler.add("Ercan");
        isimler.add("Azim");

        System.out.println(isimler); //  [Deniz, Omer, Basak, İbrahim, Ercan, Azim]

        //removeALL


        List<String> silinecekler = new ArrayList<>();

        silinecekler.add("Basak");
        silinecekler.add("Azim");
        silinecekler.add("Deniz");

        System.out.println(silinecekler); //  [Başak, Azim, Deniz]

        System.out.println(isimler.removeAll(silinecekler));// true - hepsini bulup sildi demekü
        System.out.println(isimler); //  [Omer, İbrahim, Ercan]

        List<String> silinecekler2 = new ArrayList<>();

        silinecekler2.add("Ercan");
        silinecekler2.add("Gülnur");

        System.out.println(isimler.removeAll(silinecekler2)); // true - bulabildiklerini sildi ve true verdi
                                                            // liste değiştiği için ture döndü





    }
}
