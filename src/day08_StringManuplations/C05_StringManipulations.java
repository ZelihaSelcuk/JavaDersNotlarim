package day08_StringManuplations;

import java.util.Scanner;

public class C05_StringManipulations {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir cumle alin
        //          - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //          - cumlede is geciyorsa, "calismak guzeldir"
        //          - ikisini de iceriyorsa "Hem ev lazim hem is"
        //          - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();


        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem Ev Lazım Hem İş.");
        } else if (cumle.contains("ev")){
            System.out.println("Home home Sweet Home!");
        } else if (cumle.contains("is")){
            System.out.println("Çalismak Güzeldir.");
        }else{
            System.out.println("Cok calismak Lazım.");
        }

        // harika avcı :)

        }
    }

