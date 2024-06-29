import java.util.*;

public class Average {
    public static int averageResult(int a,int b,int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the Thrid Number: ");
        int c = sc.nextInt();

        System.out.println("3 number of Average: "+ averageResult(a,b,c));



    }

}