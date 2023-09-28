package javaPractice;

import java.util.Scanner;

public class Day04_C08_StringManuplation {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Adınızı Soyadınızı ralarında bir boşluk olacak şekilde yazınız");
        String name= scanner.nextLine();
        String name2= "TARIK YIGIT";   // sistemdeki isim

        if (name.equalsIgnoreCase(name2)) {
            System.out.println("ismi doğru girdiniz");
        }else{ System.out.println("yanlış giriş yapıldı.");}

        System.out.println(name.substring(3));
        System.out.println(name.substring(5,7));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name);




    }
}
