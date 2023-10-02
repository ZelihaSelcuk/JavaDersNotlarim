package day15_multiDimentionalArrays_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {
    public static void main(String[] args) {

        // verilen bir int array de tekrar eden elementleri silip,
        // array i her elementin unique oldugu bir hale getirin

        int[]arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        // bu arrayden element silemeyiz. o yüzden bunu list e çevirmemiz gerek.
        // bir list oluşturalım boş,
        // yeni array den listeye tek tek ekleyelim, listede var mı bakarak, varsa eklemeyeyim.
        // listede yoksa ekleyelim
        // yeni bir array oluşturalım
        // listedeki elemanları yeni array e atayalım
        // yeni array i eski array e değer olarak atayalım

        // sırayla yapalım

        // bu arrayden element silemeyiz. o yüzden bunu list e çevirmemiz gerek.
        // bir list oluşturalım boş,
        List<Integer> uniqueList = new ArrayList<>();

        // yeni array den listeye tek tek ekleyelim, listede var mı bakarak, varsa eklemeyeyim.
        // listede yoksa ekleyelim

        for (int i = 0; i < arr.length ; i++) {
            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]); // arr[i] bizim oğlan, "array in tüm elemanları" denilince onu mutlaka kullanıyoruz.
            }
        }
        System.out.println(uniqueList);  //  [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]


        // yeni bir array oluşturalım

        int [] yeniArr = new int[uniqueList.size()];  // yeni oluşturulan array in uzunluğu
                                                // uniquelist in uzunluğu kadar olmalı ki tam içine alsın
        // yazdırıp görelim

        System.out.println(Arrays.toString(yeniArr));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]  içi henüz boş

        // listedeki elemanları yeni array e atayalım

        for (int i = 0; i < yeniArr.length ; i++) {
           yeniArr[i] = uniqueList.get(i);
        }

        // yeni array i eski array e değer olarak atayalım
            arr=yeniArr;

        System.out.println(Arrays.toString(arr));  // [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        // sıralarsak daha yakışıklı olur.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  harika   !!!

    }
}
