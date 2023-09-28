package javaPractice;

import java.util.Scanner;

public class Day04_C03_TernaryOperator {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        // ?--> ise   : --> değilse

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0? kenar1==kenar2 && kenar1==kenar3 ? "Üçgen eşkenar üçgendir.":"üçgen eşkenar üçgen değildir.":"yanlış değer girdiniz.");




    }
}
