package Strings;

public class _09_convert_intTo_str {
    public static void main(String[] args) {
        int a = 123;
        String b=Integer.toString(a);
        System.out.println("Using integer.toString:" + b);

        String c=String.valueOf(a);
        System.out.println("Using String.valueOf: " + c);

        String d = String.format("%d",a);
        System.out.println("Using String.format: " +d);
        System.out.println(d.getClass().getName());

    }
}
