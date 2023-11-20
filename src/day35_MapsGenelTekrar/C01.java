package day35_MapsGenelTekrar;

import java.util.Map;
import java.util.TreeMap;

public class C01 {

    public static void main(String[] args) {

       // Map<String, Integer> harfler1 = new TreeMap<>();

        // bir TreeMap objesi oluştururken
        // data türü olarak MAp secersek
        //biz bir TreeMap oluştursak da tüm MAplerle ortak olan özellikleri verir.

        // TreeMap<String, Integer> harfler = new TreeMap<>();

        // data türünü parent secebilirm (Map) ama o zaman parentlerin genel özellik metodlarına erişebilirim
        // ama kendimizin data türünü seçersek (TreeMap) (daha dar) özel alandaki tüm spesifik methodlara ulaşabiliriz.


        TreeMap<String , Integer> harfler = new TreeMap<>();

        harfler.put("A",20);
        harfler.put("P",2);
        harfler.put("S",25);
        harfler.put("F",10);
        harfler.put("Y",12);

        System.out.println(harfler); // {A=20, F=10, P=2, S=25, Y=12}

        System.out.println(harfler.descendingMap()); //  {Y=12, S=25, P=2, F=10, A=20}  tersten sıralıyor
        // bu method TreeMAp de kalıcı değişiklik yapamaz çünkü
        // TreeMAp doğal sıralı olacağından bu değişiklik kalıcı olmaz

        System.out.println(harfler.lowerKey("S")); //P
        System.out.println(harfler.lowerKey("C")); //A  olmayan harfi girdiğimizde, olsaydu nerede olurduysa onun bir önceki sırada olanını getirir
        System.out.println(harfler.floorKey("S")); // S  matematikteki aşağıya yuvarla gibidir.
        System.out.println(harfler.floorKey("K")); // F  K olmadığı için aşağıya yuvarlar.
        System.out.println(harfler.ceilingKey("A")); //  A
        System.out.println(harfler.lowerEntry("D")); //  A=20
        System.out.println(harfler.higherKey("G")); // P
        System.out.println(harfler.higherKey("S"));  // Y
        System.out.println(harfler.higherKey("Y"));  // null
        System.out.println(harfler.ceilingKey("G"));  // P
        System.out.println(harfler.ceilingKey("S"));  // S
        System.out.println(harfler.ceilingKey("Z"));  // null

        System.out.println(harfler); // {A=20, F=10, P=2, S=25, Y=12}
        System.out.println(harfler.pollFirstEntry());
        System.out.println(harfler.pollLastEntry());
        harfler.put("C",24);
        harfler.put("I",4);
        harfler.put("U",12);
        System.out.println(harfler);  // {C=24, F=10, I=4, P=2, S=25, U=12}
        System.out.println(harfler.headMap("P")); //  {C=24, F=10, I=4}  P ye kadar olan kısmı verir P hariç
        // çünkü java da sonlar exclusive dir. hariçtir.
        System.out.println(harfler.headMap("M")); //  {C=24, F=10, I=4}   olmayan harfi yazarsak, olursa nerede olurduysa ona göre çalışır
        System.out.println(harfler.headMap("P", true)); // P dahil olarak verir
        System.out.println(harfler.headMap("M", false)); // M olsaydı dahil edecekti ama olmadıgı için dahil edemedi

        System.out.println(harfler.tailMap("I"));// {I=4, P=2, S=25, U=12} I dan başla kuyruğa kadar git.
        System.out.println(harfler.tailMap("G"));
        System.out.println(harfler.tailMap("I", false)); //
        System.out.println(harfler.tailMap("G", false)); //

        // .firstEntry()
        // .lastEntry()
        // .firstKey()
        // .lastKey()
        // .subMap()

    }
}
