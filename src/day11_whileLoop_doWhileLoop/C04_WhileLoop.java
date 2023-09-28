package day11_whileLoop_doWhileLoop;

import day10_methodOlusturma_methodOverloading.C05_AsalSayiMiDondur;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan bir asal sayi girmesini isteyin
        // Kullanici asal sayi girmezse "Bu asal degil, tekrar dene" yazdirin
        // Kullanici asal sayi girdiginde, "islem basarili olarak tamamlandi" yazdirin


        Scanner scanner = new Scanner(System.in);
        int sayi = 6;  // başlangıçta asal olmaması lazım ,  yoksa loop hiç çalışamaz


        while (!C05_AsalSayiMiDondur.asalMiDondur(sayi)) { // whileloop ne zaman çalışır, ==> boolean sart true oldugu zaman çalışır.
            System.out.println("Lütfen bir asal sayı giriniz");
            sayi = scanner.nextInt();

            if (!C05_AsalSayiMiDondur.asalMiDondur(sayi)) {
                System.out.println("Bu asal degil, tekrar dene");
            } else {
                System.out.println("islem basarili olarak tamamlandi");
            }

        }
    }
}