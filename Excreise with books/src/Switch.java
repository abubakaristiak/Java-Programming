import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mouth name: ");
        int month = sc.nextInt();
        String monthN;
        switch (month){
            case 1:
                monthN = "January";
                break;
            case 2:
                monthN = "February";
                break;
            case 3:
                monthN = "March";
                break;
            case 4:
                monthN="April";
                break;
            case 5:
                monthN = "May";
                break;
            case 6:
                monthN = "June";
                break;
            case 7:
                monthN = "July";
                break;
            default:
                monthN = "Invaild operation";
                break;
        }
        System.out.println(monthN);

    }
}
