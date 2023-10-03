package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Array_KullanıcıyaListeOlusturma {

    public static void main(String[] args) {

        // Soru - Kullanıcıdan istediği kadar isim alıp
        // Q ya bastıgında girdiği isimleri bize lista eolarak döndürecek bir method oluşturun.

         System.out.println(ListeOlustur());
    }

    public static List<String> ListeOlustur() {

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenIsim;

        do {
            System.out.println("Listeye eklemek için bir isim yazın" +
                    "\nveya işlemi sonlandırmak için Q ya basın.");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")) {
                isimler.add(girilenIsim);

            }
            } while (!girilenIsim.equalsIgnoreCase("Q")) ;

            return isimler;


    }
}