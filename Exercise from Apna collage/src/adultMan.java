import jdk.jshell.Snippet;

import java.util.*;

public class adultMan {
    public static boolean Voteman(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(Voteman(age));
    }

}

