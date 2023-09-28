package day08_StringManuplations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {

        //Soru 6 : Kullanicidan bir String alin,
        //         String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //         String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String yenimetin = scanner.nextLine();
        int uzunluk = yenimetin.length();

        if (yenimetin.length() % 2 == 0) {
            System.out.println(
                    (yenimetin.substring(0, (uzunluk) / 2)) + ":)" +
                            yenimetin.substring((uzunluk)/2));

        }


    }
    }

