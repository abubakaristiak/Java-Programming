import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("1 = Summation");
        System.out.println("2 = Substraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Divide");
        int operator = sc.nextInt();


        if (operator == 1) {
            System.out.println("The result show below");
            System.out.println("Sum: " + (a + b));
        }else if(operator ==2){
            System.out.println("The result show below");
            System.out.println("Sub: " + (a - b ));
        }else if(operator ==3){
            System.out.println("The result show below");
            System.out.println("Mul: "+ (a * b));
        }else if(operator ==4){
            System.out.println("The result show below");
            System.out.println("Div: " +(a / b ));
        }else {
            System.out.println("Invaild Oparation");
        }


        }
    }

