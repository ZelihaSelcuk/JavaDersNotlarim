package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_Remove_Clear {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler);  // [Deniz, Omer, Esra, Hamza, Basak]

        // 2 çeşit remove vardı.
        // ya index i vereceğiz ya da obje vereceğiz

        // isimler.remove(2); // esrayı siler kanıt olarak sout yaparsak aşağıda esrayı yazdırır.
        System.out.println(isimler.remove(2));  // esra yı siler ve esra yazdırır.
        System.out.println(isimler);


        // ya da

        isimler.remove("Hamza"); // true


        // ya da   - remove all


        List<String> silinecekler2 = new ArrayList<>();

        silinecekler2.add("Deniz");
        silinecekler2.add("Gülnur");

        System.out.println(isimler.removeAll(silinecekler2));  //true
        System.out.println(isimler);  // [Omer, Basak]

        // verilen silineceklerden bir tanesini bile silse true döner
        // eğer ki hiç silemezse false döner


        // eğer listemiz sayılardan oluşuyorsa

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        //  remove(2) yazdığımızda java 2. indexi mi silecek yoksa elemanlardan 2 ye eşit olanı mı silecek?
        //  java bu karışıklığı önşemek için sayılardan oluşan listlerde yazılan sayıyı "INDEXéolarak kabul eder.

        System.out.println(sayilar.remove(1));  //2
        System.out.println(sayilar);  //  [3, 8]

        //  illa da obje olan 8 i silmek istiyorsak ve index ini bilmiyorsak napıcaz??
        // önce silmek istediğimiz elementi bir obje yani non- primitive olarak tanımlamalıyız.


        //int silinecekSayi = 8; // kabul etmiyor    non primitive olmalı
        //System.out.println(sayilar.removeAll(silinecekSayi));  // HATA

        Integer silinecekSayi = 8;
        System.out.println(sayilar.remove(silinecekSayi)); // true
        System.out.println(sayilar); // [3]

        // arraylist in içini biraz dolduralım çok boşaldı..

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(5);
        sayilar.add(11);
        sayilar.add(17);

        System.out.println(sayilar); // [3, 3, 2, 9, 5, 11, 17]

        // CLEAR   --  ne varsa boşaltır. Bomboş yapar. Tam takır...

        sayilar.clear();
        System.out.println(sayilar);  // []


    }
    }
