package day04_IfStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi 3'e bolunuyorsa 3'e bolunuyor
        // sayi 5'e bolunuyorsa 5'e bolunuyor
        // hem 3, hem 5'e bolunuyorsa "super sayi"
        // ne 3 ne de 5'e bolunmuyorsa "Cope at gitsin" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz:");
        int sayi = scanner.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("süper sayi");}
        else if (sayi%3==0){
                System.out.println("sayi 3 ile bölünüyor");}
        else if (sayi%5==0){
                System.out.println("sayi 5 ile bölünüyor.");}
        else{System.out.println("çöpe at gitsin");}



        }
}
