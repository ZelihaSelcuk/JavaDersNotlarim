package day08_StringManuplations;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "990087J1a5v**&^%$8a +/can809--=7dir_";

        // metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline donusturun


        str=str.replaceAll("\\d", "");
        str=str.replaceAll("\\s","5");
        str=str.replaceAll("\\W", "");
        str=str.replaceAll("_","");
        str=str.replaceAll("5", " ");

        System.out.println(str);


    }
}
