package javaPractice;

import java.util.Scanner;

public class Day03_C04 {
    public static void main(String[] args) {
        /*
        2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
        olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi K ya da E olarak Giriniz:");
        char cinsiyet = scanner.next().charAt(0);
        System.out.println("Lütfen Yaşınızı Giriniz:");
        int yas = scanner.nextInt();

        if (cinsiyet=='K') {
            if (yas>=60) {
                System.out.println ("Emekli olabilirsin");
            } else if (yas<60 && yas>=35) {
                System.out.println ("Emekli olmak icin "+(60-yas)+" Yil daha calismaniz gerekir");
            } else if (yas<35 && yas>0) {
                System.out.println ("Geçerli bir yaş giriniz");
            }
        }
        if (cinsiyet=='E') {
            if (yas>=65) {
                System.out.println ("Emekli olabilirsin");
            } else if (yas<65 && yas>=35) {
                System.out.println ("Emekli olmak icin " + (65-yas) + " Yil daha calismaniz gerekir");
            } else if (yas<35 && yas>0) {
                System.out.println ("Geçerli bir yaş giriniz");

            }
        }
    }
}
            /*
            Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
            else ile bitiyorsa tüm ihtimaller kapsanır.
            else if ile bitiyorsa kapsanmayan ihtimaller vardır.
             */