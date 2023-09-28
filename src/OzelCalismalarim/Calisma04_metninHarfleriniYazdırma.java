package OzelCalismalarim;

import java.util.Scanner;

public class Calisma04_metninHarfleriniYazdırma {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir İsim Giriniz");
        String str =scanner.nextLine();


        System.out.println(str.charAt(str.length()-1));    //tersten yazma

        for (int i = (str.length()-1); i >=0 ; i--) {
            System.out.print(str.charAt(i));
                    }

        System.out.println("");
        System.out.println(str.length()); //4
        System.out.println(str.endsWith("t")); //false
        System.out.println(str.compareTo("r"));
        System.out.println(str.substring(1));// yazmaya 1. index ten başlar
        System.out.println(str.substring(2,9)); // yazmaya 2. index ten başlar 9 a kadar 9 hariç olarak yazar
        str.substring(5);

    }
}
