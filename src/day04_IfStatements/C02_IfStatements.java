package day04_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen üçgen kenar uzunluklarını giriniz: ");
        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();
        int kenar3= scanner.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3) {
            System.out.println("Eşkenar Üçgen.");
        }

        //aynı soruyu double variable ile yaparsak;

                System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
        double kenara = scanner.nextDouble();
        double kenarb = scanner.nextDouble();
        double kenarc = scanner.nextDouble();

        // Java 2'li karsilastirmalari kabul eder
        // daha fazla karsilastirmaya ihtoyac varsa
        // mantiksal operatorler kullanilarak sartlar ayri ayri yazilip, birlestirilir

        if (kenara==kenarb  && kenarb==kenarc && kenar2>0){
            System.out.println("Verilen kenar uzunluklari es kenar ucgen olusturur");
        }


    }
}
