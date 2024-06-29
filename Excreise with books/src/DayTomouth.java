import java.util.*;
public class DayTomouth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day- ");
        int day=sc.nextInt();
        int mouth = day/30;
        int newDay=day-(mouth*30);
        System.out.println(day+"  day is equal to "+mouth+" mouth and "+newDay+" day");

    }
}
