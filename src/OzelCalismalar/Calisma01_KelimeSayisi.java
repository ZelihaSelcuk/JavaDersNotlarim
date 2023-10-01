package OzelCalismalar;

import java.util.Scanner;

public class Calisma01_KelimeSayisi {
    public static void main(String[] args) {
        /*
        Kelime Sayısı: Kullanıcının girdiği bir metinde kaç kelime olduğunu
hesaplayan bir program yazın
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz.");
        String metin=scanner.nextLine();
        int sayac=0;

        /*
        metindeki boşlukları sayarsak, onun bir fazlası kelime sayısını verecektir.
         */

        for(int i = 0; i < metin.length(); i++)
        {
            if(metin.charAt(i) == ' ') {
                sayac++;
            }
        }
        System.out.println("Girilen cumlede " + (sayac+1)+ " tane kelime vardir.");


    }
}
