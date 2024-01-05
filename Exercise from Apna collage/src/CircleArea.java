import java.util.*;
public class CircleArea {
    public static Double findArea(Double radius){
        return 3.1416*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        System.out.println(findArea(radius));
    }


}

