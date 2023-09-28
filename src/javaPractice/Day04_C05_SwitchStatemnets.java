package javaPractice;

import java.util.Scanner;

public class Day04_C05_SwitchStatemnets {
    public static void main(String[] args) {

//kullanıcıcdan bir rakam alıpn rakamı yazıyla yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz.(0-9 arasında)");
        int rakam = scanner.nextInt();

        switch (rakam){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }


    }
}
