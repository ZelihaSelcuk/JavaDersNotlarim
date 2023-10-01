package day14_Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Verilen bir array deki pozitif tam sayıları toplayıp
        //sonucu bize döndüren bir method yazınız.

        int[] arr = {2,-5,7,-8,10};

        System.out.println(pozitifSayileriTopla(arr)); // method ile bize döndürülen değeri ya yazdırmalıyız ya da
        int arrayToplmai = pozitifSayileriTopla(arr);  // yeni bir variable a atamalıyız. bu satırda atamayı yaptık.
    }

    public static int pozitifSayileriTopla(int arr[]) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }
            return toplam;
        }


}