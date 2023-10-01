package OzelCalismalar;

import java.util.Arrays;

public class Calisma08_arraySplit {
    public static void main(String[] args) {

        String str1= "Zeliha Selcuk Aktuglu";
        String[] ismim = str1.split(" ");
        System.out.println(Arrays.toString(ismim));
        String ismimhucreler = ismim[0];
        System.out.println(ismimhucreler);
        String[] ismimhucrelerarray=ismimhucreler.split("");
        System.out.println(Arrays.toString(ismimhucrelerarray));

    }
}
