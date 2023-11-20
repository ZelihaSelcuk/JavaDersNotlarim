package day32_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class MapMethodDepo {

    // verilen sube deki öğrencilerin isim ve soy isimlerini yazdıran bir method oluşturun.
    public static void subeListYazdir (Map<Integer,String>ogrenciMap , String istenenSube){
    String[] valueArr;

    Collection<String> valueCollection = ogrenciMap.values();
        for (String each:valueCollection
             ) {
            valueArr =each.split("-");
            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0] + " " + valueArr[1] );
            }
        }



    }
}
