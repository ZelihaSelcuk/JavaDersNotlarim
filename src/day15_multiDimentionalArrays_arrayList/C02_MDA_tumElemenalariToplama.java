package day15_multiDimentionalArrays_arrayList;

public class C02_MDA_tumElemenalariToplama {
    public static void main(String[] args) {

        //verilen bir MDA daki tüm sayiları toplayıp toplami yazdıran bir method oluşturun.

        int[][]arr ={{1,4,7},{3,5},{1,9,0,8},{2}};
        arr = new int[][]{{1,4,7},{3,5},{1,9,0,8},{2}};

            arraydekiElementleriTopla(arr); // array deki tüm sayıların toplamı 40
            arraydekiElementleriTopla(new int[][]{{1,2,3},{4,5,6,7}});  // array deki tüm sayıların toplamı 28
            arraydekiElementleriTopla(new int[][]{{1,1,1},{2,2,2,2}});  // array deki tüm sayıların toplamı 11
    }

            public static void arraydekiElementleriTopla (int[][]arr) {
            int toplam = 0;
            for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
              toplam += arr[i][j];
            }
        }
                System.out.println(toplam);
    }



}
