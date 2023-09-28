package javaPractice;

import java.util.Scanner;

public class Day04_C10_Odev {
    public static void main(String[] args) {

        // HESAP MAKİNASI //

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak üzere 1. Sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.println("Lütfen işlem yapmak üzere 2. Sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("YAPMAK İSTEDİĞİNİZ İSLEMİNİZİ SEÇİNİZ");
        System.out.println("TOPLAMA İÇİN 1 GİRİNİZ");
        System.out.println("ÇIKARMA İÇİN 2 GİRİNİZ");
        System.out.println("ÇARPMA İÇİN 3 GİRİNİZ");
        System.out.println("BÖLME İÇİN 4 GİRİNİZ");

        System.out.print("Secimininizi giriniz: ");
        int secim = scanner.nextInt();

        if(secim == 1) {
            System.out.println("Toplama isleminin sonucu = " + "sayi1 + sayi2 = " + (sayi1 + sayi2));
        }
        else if(secim == 2) {
            System.out.println("Çıkarma isleminin sonucu = " + "sayi1 - sayi2 = " + (sayi1 - sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminin sonucu = " + "sayi1 * sayi2 = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bölme isleminin sonucu = " + "sayi1 / sayi2 = " + sayi1 / sayi2);
        }
        else {
            System.out.println("LÜTFEN GEÇERLİ BİR SEÇİM YAPINIZ");
        }


        }
}
