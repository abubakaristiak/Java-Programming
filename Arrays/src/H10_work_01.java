import java.util.Scanner;

public class H10_work_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of name : ");
        int size = sc.nextInt();

        String names[] = new String[size];

        //input
        for (int i=0; i<size; i++){
            System.out.print("Enter name "+(i+1)+" : ");
            names[i] = sc.next();

        }

        //output
        System.out.println("List of name");
        for(int i=0; i<names.length; i++){
            System.out.println("Name "+(i+1)+ " is "+ names[i]);
        }
    }
}
