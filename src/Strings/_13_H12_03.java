package Strings;

import java.util.Scanner;

public class _13_H12_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        int atIndex = email.indexOf('@');
        String username = (atIndex != -1)? email.substring(0,atIndex): email;
        System.out.println("Username : "+ username);

    }
}
