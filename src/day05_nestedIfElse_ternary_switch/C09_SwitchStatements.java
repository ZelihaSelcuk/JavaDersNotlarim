package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C09_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicinin girdigi gun numarasina gore
        // gun isimlerini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir gün numarası giriniz.");
        int gun= scanner.nextInt();

        switch (gun) {
            case 1:
                System.out.println("PAZARTESİ");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
        }




    }
}
