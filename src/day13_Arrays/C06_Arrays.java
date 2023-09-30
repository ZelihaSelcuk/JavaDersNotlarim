package day13_Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        // Soru-4: Verilen bir array de istenen bir elemanın var olup olmadıgını
        // ve varsa kaç kere kullanıldıgını yazdıran bir metod oluşturun.


        int [] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int aranansayi = 3;

        elemanSayisiYazdir(arr,3); // Aranan Sayi Array'de 2 adet kullanılmıştır.
        elemanSayisiYazdir(arr,11); // Aranan Sayi Array'de 0 adet kullanılmıştır.
        elemanSayisiYazdir(arr,7); // Aranan Sayi Array'de 1 adet kullanılmıştır.

    }

    public static void elemanSayisiYazdir (int [] arr, int aranansayi){

        int sayac = 0;
        for (int i = 0; i <= arr.length-1 ; i++) {
            if (arr[i]==aranansayi){
                sayac ++;
            }
        }
        System.out.println("Aranan Sayi Array'de " + sayac + " adet kullanılmıştır.");
    }
}
