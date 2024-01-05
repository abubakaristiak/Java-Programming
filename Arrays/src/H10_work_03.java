import java.util.Scanner;

public class H10_work_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAcending = true;
        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAcending = false;
            }
        }
        if(isAcending){
            System.out.println("The array is sorted in ascending order");
        }
        else {
            System.out.println("The array is not sorted in ascending order");

        }
    }
}