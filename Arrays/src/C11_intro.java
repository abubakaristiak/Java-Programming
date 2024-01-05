import java.util.Scanner;

public class C11_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows number: ");
        int rows = sc.nextInt();
        System.out.println("Enter column number: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        // rows
        System.out.println("Enter element of matrix: ");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("View matrix...");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
