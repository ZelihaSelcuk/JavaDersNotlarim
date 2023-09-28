package javaPractice;

import java.util.Scanner;

public class Day04_C09_Odev {

    public static void main(String[] args) {

        /*
ÖDEV SORUSU- 20230923- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
"Simdi calisma zamani tatile .. gun var" seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise "Simdi dinlenme
zamani" yazdirin.
    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir gün adı giriniz");
        String gun = scanner.nextLine().toUpperCase();


        switch (gun){
            case "PAZARTESİ":
                System.out.println("Simdi calisma zamani tatile " + "5 gün var");
            break;
            case "SALI":
                System.out.println("Simdi calisma zamani tatile " + "4 gün var");
                break;
            case "ÇARŞAMBA":
                System.out.println("Simdi calisma zamani tatile " + "3 gün var");
                break;
            case "PERŞEMBE":
                System.out.println("Simdi calisma zamani tatile " + "2 gün var");
                break;
            case "CUMA":
                System.out.println("Simdi calisma zamani tatile " + "1 gün var");
                break;
            case "CUMARTESİ":
                System.out.println("Şimdi Dinlenme Zamanı");
                break;

        }


    }
}
