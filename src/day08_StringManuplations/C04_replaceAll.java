package day08_StringManuplations;

import java.util.Scanner;

public class C04_replaceAll {
    public static void main(String[] args) {

        // Kullanicidan isim soyisim ve kart numarasini alip
        // asagidaki sekilde yazdirin
        // Isim soyisim  : S***** G****
        // Kart No : 1234 **** **** ****


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen İsim Giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lütfen Soyisim Giriniz");
        String soyisim=scanner.nextLine();
        System.out.println("Lütfen Kart No Giriniz");
        String kartno=scanner.nextLine();

        System.out.println(
                ("İsim Soyisim: " + isim.toUpperCase().charAt(0) + isim.substring(1).replaceAll("\\w","*"))+
                (" " + soyisim.toUpperCase().charAt(0) + soyisim.substring(1).replaceAll("\\w","*")));

        System.out.println(
                ("Kart No: " + kartno.substring(0,4)+" "+
                        kartno.substring(5,9).replaceAll("\\d","*")+" "+
                        kartno.substring(10,14).replaceAll("\\d","*")+" "+
                        kartno.substring(15,19).replaceAll("\\d","*")));


        /*
            Lütfen İsim Giriniz
            Zeliha
            Lütfen Soyisim Giriniz
            Selcuk
            Lütfen Kart No Giriniz
            3537 7267 0222 0222
            İsim Soyisim: Z***** S*****
            Kart No: 3537 **** **** ****
        */



    }
}

