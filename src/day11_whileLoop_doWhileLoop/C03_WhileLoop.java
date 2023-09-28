package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin

        // Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir

         /*
            Kullanicidan alacagimiz sayi 0 olmadigi surece kod calisacak
            loop'dan once bu sayiyi olusturmamiz gerekir ki
            while() icinde kullanabilelim

            NOT : ilk deger atamasi yaparken
                  loop'un ilk calismasini engellemeyecek bir deger atamaya
                  DIKKAT EDILMELIDIR
         */

        Scanner scanner = new Scanner(System.in);
        double sayi = 44; // çalışmasına mani olmayacak herhangi bir değer verilir.
        double toplam = 0;

        while (sayi!=0) {  // kullanıcı = a abasıncaya kadar

            System.out.println("Toplanmak Üzere Sayılar Giriniz \n Bitirmek için 0'a basınız.");
            sayi = scanner.nextDouble();
            toplam +=sayi;

            //sayı sıfıra eşit olmadıgı müddetçe tekrar tekrar devam edecek.
            // tekrarlamasını istediğimiz işlemleri loop un içinde () -> yazıyoruz

        }

        System.out.println("Girilen Sayilerin Toplamı: "+ toplam);

        }





    }

