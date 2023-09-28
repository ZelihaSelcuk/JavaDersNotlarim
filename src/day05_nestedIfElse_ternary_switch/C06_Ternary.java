package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //         degilse “Eskenar degil” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz.");
        double kenar1 = scanner.nextInt();
        double kenar2 = scanner.nextInt();
        double kenar3 = scanner.nextInt();

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ? "eşkenar üçgen" : "eşkenar üçgen değil.");

    }
}
