import java.util.*;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Enter the number a-: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number b-: ");
        int b = sc.nextInt();
        int temp =a;
        a=b;
        b = temp;
        System.out.println("After swapping: ");
        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
