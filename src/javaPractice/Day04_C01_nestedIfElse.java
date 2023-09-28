package javaPractice;

import java.util.Scanner;

public class Day04_C01_nestedIfElse {
    public static void main(String[] args) {

/*
1- Kullanıcının EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
   Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
   KURALLAR
     : 1999 yılı 9. ay öncesi işe başlamış olmak
     : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
     : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen işe başlama tarihinizi giriniz:yıl ve ay olarak 1999.09 giriniz");
        //double sayi olarak alıcaz//
        double giris = scanner.nextDouble();


        if (giris > 1999.09) {
            System.out.println("EYT kanun düzenlemesine tabi değilsiniz.");
        } else {
            System.out.println("cinsiyetinizi 'K' veya 'E' olarak giriniz");
            char cinsiyet = scanner.next().toUpperCase().charAt(0);
            System.out.print("Lütfen prim ödeme gün sayınızı giriniz.");
            int primGun = scanner.nextInt();
            System.out.print("Lütfen hizmet yılı sürenizi giriniz");
            int hizmetSuresi = scanner.nextInt();

            if (cinsiyet == 'E') {
                if (primGun >= 5500 && hizmetSuresi == 25) {
                    System.out.println("kanun yürürlüğe girdiği tarihte emekeli olabişlirsiniz");
                } else if (primGun < 5500 && hizmetSuresi > 25) {
                    System.out.println("emekli olabilmek için " + (5500 - primGun) + " gün prim ödemelisiniz");
                } else if (primGun > 5500 && hizmetSuresi < 25) {
                    System.out.println("Emekli olabilmek için " + (25 - hizmetSuresi) + " yıl daha çalışmalısınız.");
                } else System.out.println("malesef henüz EYT şartlarının ikisini de sağlamıyorsunuz.");
                System.out.println("Hizmet süresi eksiği: " + (25 - hizmetSuresi));
                System.out.println("Eksik prim gün sayısı: " + (5500 - primGun));
            }
            if (cinsiyet == 'K') {
                if (primGun >= 5000 && hizmetSuresi == 20) {
                    System.out.println("kanun yürürlüğe girdiği tarihte emekeli olabişlirsiniz");
                } else if (primGun < 5000 && hizmetSuresi > 20) {
                    System.out.println("emekli olabilmek için " + (5000 - primGun) + " gün prim ödemelisiniz");
                } else if (primGun > 5000 && hizmetSuresi < 20) {
                    System.out.println("Emekli olabilmek için " + (20 - hizmetSuresi) + " yıl daha çalışmalısınız.");
                } else System.out.println("malesef henüz EYT şartlarının ikisini de sağlamıyorsunuz.");
                System.out.println("Hizmet süresi eksiği: " + (20 - hizmetSuresi)+" yıl");
                System.out.println("Eksik prim gün sayısı: " + (5000 - primGun)+" gun");
            } else {
                System.out.println("yanlış bir değer girdiniz.");
            }


        }
    }
}