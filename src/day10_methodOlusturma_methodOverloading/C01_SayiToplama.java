package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_SayiToplama {

    public static void main(String[] args) {

        //verilen iki sayıyı toplayıp sonucu yazdıran bir metod oluşturun.


        toplaYazdir(5,3.1);
        toplaYazdir(2,8.9);
        toplaYazdir(5,6.4); // Verilen iki sayinin toplami : 11.4
        toplaYazdir(7,6); // Verilen iki sayinin toplami : 13.0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        toplaYazdir(sayi1,sayi2);


    }// main method sonu

 public static void toplaYazdir(double sayi1,double sayi2){
     System.out.println("Verilen iki sayinin toplmaı: "+(sayi1+sayi2));
 }

} // class sonu
