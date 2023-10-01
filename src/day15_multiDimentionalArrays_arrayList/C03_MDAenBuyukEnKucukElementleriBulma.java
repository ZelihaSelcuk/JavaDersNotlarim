package day15_multiDimentionalArrays_arrayList;

public class C03_MDAenBuyukEnKucukElementleriBulma {
    public static void main(String[] args) {

        // verilen bir array de en küçük ve en büyük sayıları bulup
        // yazdiran bir metod oluşturun.

        int[][]arr ={{1,4,7},{3,5},{1,9,0,8},{2}};

        enBuyukEnKucukElementleriBulYazdir(arr);
    }

    public static void enBuyukEnKucukElementleriBulYazdir (int[][]arr){

        int enBuyukSayi = 0;  // "0" yerine arr[0][0] da yazılabilir.
        int enKucukSayi = 0;  // "0" yerine arr[0][0] da yazılabilir.

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
              if (arr[i][j] > enBuyukSayi) {
                  enBuyukSayi = arr[i][j];
              }
                if (arr[i][j] < enKucukSayi){
                    enKucukSayi = arr[i][j];
                }
            }
        }
        System.out.println("Verilen Array de En Büyük Sayi: " + enBuyukSayi);
        System.out.println("Verilen Array de En Küçük Sayi: " + enKucukSayi);

    }
}
