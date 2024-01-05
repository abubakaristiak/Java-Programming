import java.util.Scanner;

public class _1to10print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i=10; i<=n; i++){
//            System.out.println(i);
//        }
        int i=0;
        int sum=0;
        do {
            if (i%2!=0){
                sum = sum+i;
            }
            i++;
        }
        while (i<=n);
        System.out.println(sum);
    }

}
