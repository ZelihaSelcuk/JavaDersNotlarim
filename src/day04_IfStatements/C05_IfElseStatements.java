package day04_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karakter=scanner.next().charAt(0);

        if (karakter>'A' && karakter <'Z'){
            System.out.println("Büyük Harf");}
        else {
            System.out.println("Büyük Harf Değil");}

        }
}
