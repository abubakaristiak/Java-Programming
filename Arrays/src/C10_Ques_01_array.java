import java.util.Scanner;

public class C10_Ques_01_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int numbers[] = new int[size];

        //input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the value which you want to search: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("x found at "+ i);
            }

        }
    }

}
