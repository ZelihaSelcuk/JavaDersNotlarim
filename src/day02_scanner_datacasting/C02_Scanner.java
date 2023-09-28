package day02_scanner_datacasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp dikdörtgenin alanını yadırın.

       // kullanıcıdan birşey alıyorsak elmecbur scanner objesi oluşturucaz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin Alanı:" + kenar1*kenar2);

    }
}
