package java_examples.java_oop.java_constructors;

public class ConstructorWithParameters {
    int x;

    public ConstructorWithParameters(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ConstructorWithParameters myObj = new ConstructorWithParameters(5);
        System.out.println(myObj.x);
    }
}
