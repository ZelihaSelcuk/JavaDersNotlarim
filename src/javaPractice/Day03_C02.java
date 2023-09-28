package javaPractice;

import java.util.Scanner;

public class Day03_C02 {
    public static void main(String[] args) {

        /*
        1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
        *** String icin equals method'unusalı kullanin
        */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün?");
        String gun = scanner.next();

        if (gun.equals("pazartesi")||gun.equals("salı")||gun.equals("çarşamba")||gun.equals("perşembe")||gun.equals("cuma"));
        {
            System.out.println("Bugün hafta içi bir gün");

        }

    }

}
