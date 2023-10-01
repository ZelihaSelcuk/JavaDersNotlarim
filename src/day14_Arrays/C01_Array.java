package day14_Arrays;

import java.util.Arrays;

public class C03_Array {
    public static void main(String[] args) {
        // verilen bir array e istenen bir elemanı ekleyip bize döndüren bir method yazin,
        // yeni değeri eski array e atayın

int [] arr = {1,2,3,4,5};
int eklenecekEleman = 6;

      int [] yeniArray=arrayeElemanEkle(arr, eklenecekEleman);
        System.out.println(Arrays.toString(yeniArray));

    }
     public static int[] arrayeElemanEkle(int[]arr, int eklenecekEleman){
        int[] yeniArr = new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
           yeniArr[i] = arr[i];
         }
         yeniArr[yeniArr.length-1] = eklenecekEleman;

         return yeniArr;
     }

}
