package day06_StringManuplations;

public class C07_contains {
    public static void main(String[] args) {

        String str = "Javaya cok calisirsan, cok cabuk is bulursun";

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("java")); // false

        System.out.println(str.contains("av")); // true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("")); // true
        System.out.println(str.contains("cok calis")); // true

        System.out.println(str.replace('J','a'));
        System.out.println(str.repeat(3)+" ");
        System.out.println(str.trim());

    }
}
