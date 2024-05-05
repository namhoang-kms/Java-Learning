package java_examples;

public class JavaMethods {

    public static void main(String[] args) {
        myMethod();

        myName("Chi"); // My name is Chi.
        myName("Nam"); // My name is Nam.

        myInfo("Liam", 5);  // My name is Liam, 5 years old.

        myInfo2("Liam", 5, 110.5);  // My name is Liam, 5 years old and 110.5cm tall.

        int z = myCalculator(5, 3);
        System.out.println(z);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myName() {
        String fname = "Chi";
        System.out.println("My name is " + fname);
    }

    static void myName(String fname) {
        System.out.println("My name is " + fname);
    }

    static void myInfo(String fname, int age) {
        System.out.println("My name is " + fname + ", " + age + " years old.");
    }

    static void myInfo2(String fname, int age, double height) {
        System.out.println("My name is " + fname + ", " + age + " years old and " + height + "cm tall.");
    }

    static int myCalculator(int x, int y) {
        return x + y;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

}
