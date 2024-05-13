package java_examples.java_oop.java_modifiers;

public class JavaFinal {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        JavaFinal myObj = new JavaFinal();
//        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);

    }
}
