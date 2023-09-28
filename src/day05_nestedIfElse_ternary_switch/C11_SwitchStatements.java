package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden,
        //         anlamini ogrenmek istedigi harfi alin
        //         ve girilen harfin karsiligini yazdirin.
        //	I : International  S : Software T : Testing Q : Qualifications B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen anlamını öğrenmek istediğiniz harfi giriniz");
        char harf = scanner.next().toUpperCase().charAt(0);

        switch (harf){
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("board");
                break;
            default:
                System.out.println("Lutfen ISTQB kisaltmasindaki harflerden birini yaziniz");


        }


    }
}
