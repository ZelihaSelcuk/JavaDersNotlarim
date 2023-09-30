package day13_Arrays;

import java.lang.reflect.Array;

public class C04_Arrays {
    public static void main(String[] args) {

        // verilen String bir array de istenen harfi içeren elementleri yazdırın.

        String [] arr = { "Huseyin","Mehmet","Esra","Ercan","Ömer"};
        String istenenHarf = "a";


        for (int i = 0; i < arr.length; i++) {
           if (arr[i].contains("a")){
               System.out.println(arr[i]);


           }
        }



    }
}
