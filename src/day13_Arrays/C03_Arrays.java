package day13_Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

// verilen bir array deki tüm elemanların değerlerini  2 artıırın.

int [] arr = {3,5,7,10};


        for (int i = 0; i <arr.length ; i++) {

            System.out.print((arr[i] + 2) + " "); // böyle yaparsak 2 fazlalarını sadece yazdırır.
        }

        System.out.println(" ");

        for (int i = 0; i <arr.length ; i++) {

            System.out.print((arr[i] += 2)+ " "); // böyle yaparsak 2 fazlalarını atar ve yazdırır.
        }




    }
}
