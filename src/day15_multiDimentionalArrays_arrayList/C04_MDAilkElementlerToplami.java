package day15_multiDimentionalArrays_arrayList;

public class C04_MDAilkElementlerToplami {
    public static void main(String[] args) {

        // verilen bir MDA da
        // her inner array in ilk elementinin toplamını
        // bize döndüren bir method oluşturunuz.

        int[][]arr ={{1,4,7},{3,5},{1,9,0,8},{2}};

        ilkElementlerToplami(arr);
        System.out.println(ilkElementlerToplami(arr));


    }

    public static int ilkElementlerToplami (int[][]arr) {

        int ilkElementlerToplami = 0;

        for (int i = 0; i < arr.length; i++) {  //çift katlı for a gerek yok,
                                                // arr[0], arr[1], arr[2], arr[3]  getirecek
                                                // hepsinin ilk elementleri j=0 ıncı index
                ilkElementlerToplami += arr[i][0];
        }
        return ilkElementlerToplami;
    }
}