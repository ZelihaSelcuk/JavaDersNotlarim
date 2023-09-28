package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // kullanicidan gun numarasini alip
        // hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz");
        int gun = scanner.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("yanlış gün numarası");
                break;
        }

    }
}
