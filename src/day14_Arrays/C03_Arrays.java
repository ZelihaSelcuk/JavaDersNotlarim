package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {

        //Kullanıcıdan bir değer alıp array e ekleyin.

        int [] arr ={3,4,5};

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen array e eklenmek üzere bir değer giriniz: ");
        int eklenecekDeger = scanner.nextInt();

        int[] yeniArr = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
          yeniArr[i]=arr[i];
        }
        yeniArr[arr.length]=eklenecekDeger;
        System.out.println("yeniArr:"+ Arrays.toString(yeniArr));
    }
}
