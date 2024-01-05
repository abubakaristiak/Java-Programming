import java.util.Scanner;

public class Exercise01_09 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        while (n1 != n2){
            if(n1>n2){
                n1 = n1 - n2;

            }
            else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is: "+n2);

    }
}
