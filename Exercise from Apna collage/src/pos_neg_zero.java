import java.util.Scanner;





public class pos_neg_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize counters
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (or 0 to stop): ");

            if (input.hasNextInt()) {
                int num = input.nextInt();

                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else if (num == 0) {
                    zeroCount++;
                    break; // Exit the loop when 0 is entered
                }
            } else {
                System.out.println("Invalid input. Please enter a number or 0 to stop.");
                input.next(); // Clear the invalid input
            }
        }

        // Display the counts
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        // Close the scanner
        input.close();
    }
}

