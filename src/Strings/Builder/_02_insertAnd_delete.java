package Strings.Builder;

public class _02_insertAnd_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // insert character
        sb.insert(2,'n');
        System.out.println(sb);

        // delete character
        sb.delete(2,4);
        System.out.println(sb);
    }
}
