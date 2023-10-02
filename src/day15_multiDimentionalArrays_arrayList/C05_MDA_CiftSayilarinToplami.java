package day15_multiDimentionalArrays_arrayList;

public class C05_MDA_CiftSayilarinToplami {
    public static void main(String[] args) {

        // verilen 2 katlı bir array de çift sayıları bulup
        // sonucu yazdıran bir method oluşturun.

        int[][]arr ={{1,4,7},{3,5},{1,9,0,8},{2}};
        ciftSayilarToplaminiYazdir(arr);  //Array deki Cift Sayilarin Toplami :14
    }

    public static void ciftSayilarToplaminiYazdir (int[][]arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(arr[i][j] %2==0){
                    toplam += arr[i][j];
            }
            }
        }
        System.out.print("Array deki Cift Sayilarin Toplami :" + toplam );
    }
}
