package day02_scanner_datacasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin (yazarken değiştirin değil, gerçekten değiştirin.)
        //swap: değiştirmek anlamında

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen ilk tam sayıyı giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiğiniz Değerler: sayi1 = " + sayi1 + ",sayi2=" + sayi2);

        int bosKova = 0;
        bosKova = sayi2;
        sayi2 = sayi1;
        sayi1 = bosKova;


        System.out.println("Girdiğiniz Değerler: sayi1 = " + sayi1 + ",sayi2=" + sayi2);

    // kendi örneğim:

        System.out.println("===============Kendi Örneğim================");
        System.out.println("lütfen ilk tam sayıyı giriniz");
        int sayia = scanner.nextInt();
        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayib = scanner.nextInt();

        int bosKovam = 0;

        bosKovam = sayia;
        sayia = sayib;
        sayib= bosKovam;

        System.out.println("Girilen Değerler:Sayi a  =" +sayia+" Sayi b ="+sayib );

    }
}
