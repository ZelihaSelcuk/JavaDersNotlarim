package day10_methodOlusturma_methodOverloading;

public class C03_AsalSayiBulma {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // asal olup olmadigini kontol edip
        // asal ise true, asal degil ise false yazdiran bir method olusturun

asalMiYazdır(65);
asalMiYazdır(47);
asalMiYazdır(63);


    }

    public static void asalMiYazdır(int sayi){
         boolean flag = true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }

}
