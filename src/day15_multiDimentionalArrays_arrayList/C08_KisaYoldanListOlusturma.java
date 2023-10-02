package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_KisaYoldanListOlusturma {
    public static void main(String[] args) {

        int[]arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};  // array oluşturmak kolay tek seferde kafamıza göre yazabiliyoruz.

        // yukarıdaki elemanların oldugu bir List oluşturun..
        // tek tek eklemek çok zor, bu işin amelelikl kısmını for loop a yaptırabiliriz.


        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);   // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
