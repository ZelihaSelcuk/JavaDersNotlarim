package javaPractice;

import java.util.Scanner;

public class Day03_C03 {
    public static void main(String[] args) {
        /* 1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz:");
        int not = scanner.nextInt();

        if (not<=100 && 85<=not) {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "AA dır. Tebrikler..");
        } else if (not<85 && 80<=not) {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "BA dır.");
        } else if (not<80 && 75<=not) {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "BB dır.");
        } else if (not<75 && 65<=not) {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "CB dır.");
        } else if (not<65 && 50<=not) {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "CC dır.");
        } else if (not<0 || not >100) {
            System.out.println("Geçersiz not girdiniz.");
        } else {
            System.out.println("Girdiğiniz not değerinin harf karşılığı :" + "FF dır. Daha etkin çalışmalısınız.");
        }

    }
}
