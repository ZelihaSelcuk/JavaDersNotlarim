package day04_IfStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // ogrenciden notu alip gectin veya kaldin yazdiralim
        // ogrenci 0'dan kucuk veya 100'den buyuk bir not girerse
        // "gecersiz not" yazdiralim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");
        int not = scanner.nextInt();

        if (not<0 || not>100){
            System.out.println("geçersiz not");}
        else if (not>50){
            System.out.println("Geçtin");}
        else {
            System.out.println("kaldin");}


        }
}
