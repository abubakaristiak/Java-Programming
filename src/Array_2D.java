import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] numbers = new int[rows][col];

        //rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        //Output
        for(int i =0; i<rows; i++){
            for(int j= 0; j<col; j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();

        }

    }
}
