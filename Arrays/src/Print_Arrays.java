import java.util.Scanner;

public class Print_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt(); // this is array size
        System.out.println("Enter the elements: ");
        int numbers[] = new int[size]; // element are the store in numbers[i] variable

        //input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }

}
