package javaPractice;

import java.util.Scanner;

public class Day04_C02_nestedIfElse {
    public static void main(String[] args) {

     /*
     2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
     kullaniciya musteri karti olup olmadigini sorun.

    Musteri karti varsa 10 urunden fazla alirsa %20,
    yoksa %15 indirim yapin,
    Musteri karti yoksa 10 urunden fazla alirsa %15,
    yoksa %10 indirim yapin
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz ürün adedini giriniz");
        int adet = scanner.nextInt();
        System.out.println("Lütfen ürün liste fiyatını giriniz");
        double fiyat = scanner.nextDouble();
        System.out.println("T127 kart kullanıyor musunuz? E/H ");
        char kart = scanner.next().toUpperCase().charAt(0);

        if (kart=='E'){
            if (adet>10){
                System.out.println("%20 indirim kazandınız, ödemeniz gereken tutar: " + (fiyat * adet * 0.8));
            } else {
                System.out.println("%15 indirim kazandınız, ödemeniz gereken tutar: " + (fiyat * adet * 0.85));
            }
        }

        if (kart=='H'){
            if (adet>10){
                System.out.println("%15 indirim kazandınız, ödemeniz gereken tutar: " + (fiyat * adet * 0.85));
            } else {
                System.out.println("%10 indirim kazandınız, ödemeniz gereken tutar: " + (fiyat * adet * 0.9));
            }
        }










    }
}
