package OzelCalismalarim;

import java.util.Arrays;
import java.util.Scanner;

public class Calisma06_arrayeElemanEkleme_1 {
    public static void main(String[] args) {

        //Kullanıcıdan bir değer alıp array e eklemeye yarayan bir method oluşturun.

        int[]arr = {3,4,5,6,7};

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen array e eklenmek üzere bir değer giriniz: ");
        int eklenenSayi = scanner.nextInt();

        System.out.println(Arrays.toString(arrayeElemanEkleme(arr,eklenenSayi)));


    }
    public static int[] arrayeElemanEkleme(int[]arr, int eklenenSayi) {

        int[]yeniArr=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
          yeniArr[i]= arr[i];
        }
        yeniArr[arr.length]=eklenenSayi;
        return yeniArr;
    }
}
