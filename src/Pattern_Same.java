import java.util.*;
public class Pattern_Same {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row(Koi line) Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the Coloum(Koi ta start) Number");
        int m = sc.nextInt();
        // Outer loops
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        }

    }

