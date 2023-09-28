package javaPractice;

import java.util.Scanner;

public class Day04_C04_TernaryOperator {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Yılsonu Notunuzu Giriniz:");
        int not = scanner.nextInt();

        System.out.println((not > 50 ? "sınıfı geçtiniz" : "malesef kaldınız"));

    }
}
