import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        // Author: Abu Bakar Istiak

        int f0 = 0, f1 = 1, f;
        System.out.println("Enter the number of times to run: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(" " + f0 + " ");

        int i = 1;
        if (n > 1) {
            do {
                f = f0 + f1;
                System.out.print(" " + f + " ");
                f1 = f0;
                f0 = f;
                i++;
            } while (i < n);
        }
    }
}
