package day04_IfStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz:");
        int not = scanner.nextInt();

        if (not>=50){
            System.out.println("Sınıfı Geçtin");}
        else {
            System.out.println("Malesef Kaldın");}
    }
}
