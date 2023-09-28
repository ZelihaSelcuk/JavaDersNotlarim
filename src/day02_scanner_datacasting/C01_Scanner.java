package day02_scanner_datacasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        //        girilen degerleri aciklamalariyla yazdirin.

        //adım1: scanner objesi oluşturalım
        Scanner scanner = new Scanner(System.in);

        //adım2: kullanıcıya ne istediğinizi söyleyin.
        System.out.println("lutfen isminizi giriniz");

        //adım3: girilen bilgiye uygun bir variable oluştuup data türüne uygun next metodu ile bilgiyi alıp kaydedin.
        String girilenisim = scanner.nextLine();

        //ikinci bir tamsayı olarak yaşını isteyelim.
        System.out.println("lutfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        // emekli misiniz ? true veya false girsin
        System.out.println("Emekli misiniz? true veya false olarak giriniz");
        boolean emekliMi = scanner.nextBoolean() ;

        System.out.println("girdiginiz isim: " + girilenisim);
        System.out.println("Yaşınız :" + yas);
        System.out.println("emekli misiniz? : " + emekliMi);

    }
}
