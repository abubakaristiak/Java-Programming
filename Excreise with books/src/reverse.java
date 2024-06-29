public class reverse {
    public static void main(String[] args) {
        int numbers = 455512, reverse = 0;
        while (numbers !=0){
            int remainder = numbers % 10;
            reverse = reverse * 10 + remainder;
            numbers = numbers/10;
        }
    }
}
