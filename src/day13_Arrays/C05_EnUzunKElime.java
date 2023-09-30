package day13_Arrays;

public class C05_EnUzunKElime {
    public static void main(String[] args) {

        // Soru-6: verilen String bir Array deki en uzun ve en kısa kelimeleri
        // yazdıran bir method oluşturun.

String [] isimler= { "Huseyin","Mehmet","Esra","Ercan","Ömer"};

enUzunEnKisaYazdir(isimler);


    }

    public static  void enUzunEnKisaYazdir (String[] arr){
    String enKisaisim=arr[0];
    String enUzunIsim=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length() > enUzunIsim.length()) {
                enUzunIsim = arr[i];
            }
            if (arr[i].length()<enKisaisim.length()){
                enKisaisim = arr[i];
            }

        }
        System.out.println("En Uzun İsim: "+ enUzunIsim);
        System.out.println("En Kısa İsim: "+ enKisaisim);

        }
}
