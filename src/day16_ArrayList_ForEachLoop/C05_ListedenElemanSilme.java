package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {
    public static void main(String[] args) {

        // verilen string bir listede istenmeyen harf içeren elementleri silip
        // kalan kısmını liste olarak bize döndüren bir method oluşturun

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Ömer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Başak");

        String silinecekHarf = "a";

        System.out.println(isimler);

        System.out.println(istenmeyenleriSil(isimler, "a"));   // [Deniz, Ömer, Hamza]


        // hamza yı silmedi...[Deniz, Ömer, Hamza]
        // hamza dan önce esra yı silince esranın index ine hamza yı
        // kaydırdı ve index e göre kontrol ettiği için onu atladı.
        // bunu çözmek için method a "i--" ekledik.



    }

    public static List<String> istenmeyenleriSil(List<String>isimler,String silinecekHarf){



        for (int i = 0; i < isimler.size() ; i++) {
            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                    isimler.remove(isimler.get(i));
                    i--;


            }
        }

            return isimler;




    }

}
