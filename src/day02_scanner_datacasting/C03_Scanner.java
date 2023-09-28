package day02_scanner_datacasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan ismini soy ismini ve yaşını alıp aşağıdaki formatta yazdırın.
        // girilen bilgiler : J Doe, 44


        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("lütfen isminizi giriniz");
        char ilkharf = scanner.nextLine() .charAt(0);

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen Bilgiler :" + ilkharf+ " "+soyisim+", "+yas );
*/
        System.out.println("========== Örnek:2 =================");

// Örnek:2 Kullanıcıdan ismini soy ismini ve yaşını alıp aşağıdaki formatta yazdırın.
        // girilen bilgiler : Zelihaha S. Aktuğlu, **

        System.out.println("Lütfen İsminizi Giriniz");
        String isimsoyisim = scanner.nextLine();
        char sonharf = isimsoyisim.charAt(4);
        char sondanbirinciharf = isimsoyisim.charAt(5);
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yasyildizli = scanner.nextInt();

        System.out.println(isimsoyisim.substring(0,6)+sonharf+sondanbirinciharf+" "
                +isimsoyisim.charAt(7)+". "+isimsoyisim.substring(14)+", **");


    }
}
