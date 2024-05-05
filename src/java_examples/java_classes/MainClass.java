package java_examples.java_classes;

public class MainClass {
    static int x = 15;

    public static void main(String[] args) {
        System.out.println(x);
        FirstClass myFirstClass = new FirstClass();
        System.out.println(myFirstClass.x);
        SecondClass mySecondClass = new SecondClass();
        System.out.println(mySecondClass.x);
    }
}