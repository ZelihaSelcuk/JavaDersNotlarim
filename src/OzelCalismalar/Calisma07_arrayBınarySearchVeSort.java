package OzelCalismalar;

import java.util.Arrays;

public class Calisma07_arrayBınarySearchVeSort
{
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        System.out.println(Arrays.toString(arr)); //[3, 6, 1, 8, 2, 9, 12, -1, 4, 3]
        System.out.println(arr[0]);//3
        // System.out.println(arr[0,1]);  böyle bir yazım yok

        System.out.println(Arrays.binarySearch(arr, 6)); // -11 , sort yapmadan aratınca öngörülemez bir yanlış sonuç çıkardı
        Arrays.sort(arr);  // sort ve toString i ayrı ayrı satırlarda yapıyoruz
        System.out.println(Arrays.toString(arr)); // sort ve toString i ayrı ayrı satırlarda yapıyoruz

        String[] isimler = {"Esra","Ibrahim","Huseyin","Omer","Azim","Azim"};
        System.out.println(isimler[1]); //Ibrahim
        Arrays.sort(isimler); // sort ve toString i ayrı ayrı satırlarda yapıyoruz
        System.out.println(Arrays.toString(isimler)); // [Esra, Ibrahim, Huseyin, Omer, Azim, Azim]




    }
}
