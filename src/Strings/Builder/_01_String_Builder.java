package Strings.Builder;

public class _01_String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
    }
}
