package Strings;

public class _10_Check_type {
    public static class SampleClass {
        void displayType(int var) {
            System.out.println("Integer Number!");
        }

        void displayType(String var) {
            System.out.println("String Type");
        }
        void displayType(double var) {
            System.out.println("Double type");
        }

        void displayType(float var) {
            System.out.println("Float Type");
        }

        void displayType(char var) {
            System.out.println("Character Type");
        }
    }

    public static void main(String[] args) {
        // this code only work for String type data
//        String str = "abc";
//        System.out.println(str.getClass().getName());

        String str = "abc";
        int i = 121;
        float f = 123.21f;

        SampleClass s = new SampleClass();
        s.displayType(i);
        s.displayType(str);
        s.displayType(f);
        s.displayType('A');
    }
}
