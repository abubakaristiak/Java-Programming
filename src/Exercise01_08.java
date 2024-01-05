import java.util.*;

public class Exercise01_08 {
    public static void main(String[] args) {
        System.out.println("Enter base: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("Enter power: ");
        int n = sc.nextInt();
        int result = 1;

        for(int i=0; i<n; i++){
            result *= x;
        }
        System.out.println("The result is : "+ result);


    }
}
