package day08_StringManuplations;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         	- ilk harf kucuk harf olmali
        //         	- son karakter rakam olmali
        //         	- sifre bosluk icermemeli
        //         	- uzunlugu en az 10 karakter olmali


        // flag kullanalim
        int flag = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag=11;

        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag=11;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre Bosluk içermemeli.");
            flag=11;

        }
        if (!(sifre.length() >= 10)) {
            System.out.println("Sifre en az 10 karalter olmalı");
            flag=11;

        }

        if (flag==10){
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
