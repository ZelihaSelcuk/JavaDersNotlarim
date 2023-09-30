package day13_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

int[]arr= new int[5];

/*
bir array oluşturulurken 2 şey mutlaka deklare edilmeldir.
1- içine konulacak eşlemanların data türü
2- array ın içine konulacak element sayısı (lenght)

 */

        int[] arr2={4,1,7,5}; // lenght=4
        System.out.println(arr2[1]); //1
        System.out.println(arr2[3]); //5
        System.out.println(arr2[arr2.length - 1]);

        //ilk array de değer ataması yapmadık.
        //eğer array i aşağıdaki gibi oluşturursak
        // değer ataması yapmadığımız için java ona defaul tdeğeriş atar


        System.out.println(arr[3]); //0
        System.out.println(arr[arr.length-1]); //0


        // olmayan indexteki bir elemente ulaşamak istersek nolur?
        // System.out.println(arr2[5]);
        // itiraz etmiyor ama kaçıncı indexdekini istediğini
        // java kodu çalıştırdıgında anlıyor ve "ArrayIndexOutOfBoundsException" hatası verir


        // olmayan bir indexe atama yapabilir msnz?
        // arr[4]=8;
        // itiraz etmiyor ama kaçıncı indexdekini istediğini
        // java kodu çalıştırdıgında anlıyor ve "ArrayIndexOutOfBoundsException" hatası verir


        // array oluşturulduktan sonra olmayan index kullanılarak yeni değer atamak mümkün değildir.
        // yani 4 eleman varsa  index kullanarak 5. yi ekleyemeyiz
        // aynı şekilde 4 elemanı olan bir arrayden bir elemanı silip 3 elemanlı bşr array e çeviremezsiniz.







    }
}
