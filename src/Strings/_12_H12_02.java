package Strings;

import java.util.Scanner;

public class _12_H12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String original = sc.nextLine();
        String result = original.replace('e','i');
        System.out.println(original);
        System.out.println(result);

    }
}
