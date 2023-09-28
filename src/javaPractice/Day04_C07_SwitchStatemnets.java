package javaPractice;

import java.util.Scanner;

public class Day04_C07_SwitchStatemnets {
    public static void main(String[] args) {

/*
Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın

Kural 1: 4 ile bolunen yillar artik yildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bilgi istediğiniz yılı giriniz.");
        int year=scanner.nextInt();
        System.out.println("Gün sayısını aradığınız ayın numarasını giriniz.");
        int numMonth =scanner.nextInt();
        int numdays ;

        switch (numMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz aydaki gün sayısı:31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz aydaki gün sayısı: 30");
                break;
            case 2:
                numdays=(year%4==0 && !(year%100==0) || year%400==0)?29:28;
                System.out.println("girdiğiniz aydaki gün sayısı: " + numdays);
                break;








        }



    }
}
