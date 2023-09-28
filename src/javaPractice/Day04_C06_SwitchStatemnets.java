package javaPractice;

import java.util.Scanner;

public class Day04_C06_SwitchStatemnets {
    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki basamaklı bir sayı giriniz");
        int sayi = scanner.nextInt();


        if (sayi>=10 && sayi<=99){

            int birlerbasamagi =sayi%10;
            int onlarbasamagi = sayi/10;

            switch (onlarbasamagi){
                case 1:
                    System.out.print("on");
                break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmış");
                    break;
                case 7:
                    System.out.print("yetmiş");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");
                    break;
            }

            switch (birlerbasamagi){
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üç");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("beş");
                    break;
                case 6:
                    System.out.print("altı");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

            }

        }



    }
}
