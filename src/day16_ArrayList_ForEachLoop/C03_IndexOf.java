package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {

        List<String> isimler =new ArrayList<>();
        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");
        isimler.add("Esra");

        System.out.println(isimler); // [Deniz, Ömer, Esra, Hamza, Başak, Esra]

        System.out.println(isimler.indexOf("Esra"));// 2  // 2 tane esra var , esra nın ilk index ini verir.
        System.out.println(isimler.lastIndexOf("Esra")); // 5  // esra nın sonuncu indexini verir.

        // olmayan isimin index ini istesek ??

        System.out.println(isimler.indexOf("Ercan")); // -1 //  yok
        System.out.println(isimler.indexOf("Azim")); // -1 //   yok
        System.out.println(isimler.indexOf("Gülnur")); // -1 //   yok



    }
}
