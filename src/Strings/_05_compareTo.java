package Strings;

public class _05_compareTo {
    public static void main(String[] args) {
        String name1 = "Abubakar";
        String name2 = "Abubakar";

        if(name1.compareTo(name2) ==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
