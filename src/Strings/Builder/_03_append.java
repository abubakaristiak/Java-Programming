package Strings.Builder;

public class _03_append {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("h"); // Use double quotes for strings
//        sb.append('e'); // Use single quotes for characters, and you need to call append inside a method
//        System.out.println(sb.toString()); // Print the contents of the StringBuilder
        StringBuilder sb = new StringBuilder("H");
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        System.out.println(sb);
    }
}
