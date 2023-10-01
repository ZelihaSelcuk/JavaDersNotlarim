package OzelCalismalar;

import java.util.Scanner;

public class Calisma03_KelimeTersCevirici {
    public static void main(String[] args) {
/*
Kullanıcının girdiği bir cümledeki kelimeleri tersine çeviren bir program yazın
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime=scanner.nextLine();

        /*System.out.println("Kelimenin Uzunluğu: "+kelime.length()+ " karakterdir.");
        System.out.print(kelime.charAt(kelime.length()-1));
        System.out.print(kelime.charAt(kelime.length()-2));
        System.out.print(kelime.charAt(kelime.length()-3));
        System.out.print(kelime.charAt(kelime.length()-4));
        */

        /*
        kelimenin uzunlugunuzu bilemeyeceğimiz için for ile yapmalıyız.
         */

        for (int i = kelime.length()-1; i >=0 ; i--) {System.out.print(kelime.charAt(i));}



    }
}
