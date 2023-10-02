package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_Equals {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        List<Integer> sayilar2 = new ArrayList<>();

        // şu anda her iki liste de boş
        // eşit mi bakalım...

        System.out.println(sayilar1.equals(sayilar2)); //  true   döndürür. ikisi de boş ve eşit

        // eklemeler yapalım.

        sayilar1.add(1);
        sayilar2.add(2);
        System.out.println(sayilar1.equals(sayilar2)); // false

        sayilar1.add(0,2);
        sayilar2.add(1);
        System.out.println(sayilar1.equals(sayilar2)); // true

        sayilar1.add(0,3);
        sayilar2.add(3);
        System.out.println(sayilar1.equals(sayilar2)); //  false  // elemanlar aynı olsa da sırası farklı olunca false verir.

        Collections.sort(sayilar1);
        Collections.sort(sayilar2);
        System.out.println(sayilar1.equals(sayilar2)); //  true   // her iki liste de sıralanınca aynı oldu ve true verdi.




    }
}
