package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {
    public static void main(String[] args) {
        // verilen pozitif bir n tamsayisini alarak
        // bize ilk n tane fibonacci sayisini bir List olarak döndüren bir Method oluşturun.
        // Fibonacci:   0 1 1 2 3 5 8 13 21 34 55 89 144 ..... ( kendinden önceki 2 rakamı toplayan dizi)

        int ListedekiSayiAdedi;

        System.out.println(FibonacciListesiOlustur(10));

    }
        public  static List<Integer> FibonacciListesiOlustur (int ListedekiSayiAdedi){
        List<Integer> fibonacciList = new ArrayList<>();
            if (ListedekiSayiAdedi==1){
                fibonacciList.add(0);
                }else if (ListedekiSayiAdedi==2){
                fibonacciList.add(0);
                fibonacciList.add(1);
            }else
                fibonacciList.add(0);
                fibonacciList.add(1);
            for (int i = 2; i < ListedekiSayiAdedi ; i++) {    //i burada sayının indexi
               fibonacciList.add((fibonacciList.get(i-1)+fibonacciList.get(i-2)));
            }

            return fibonacciList;


        }
}
