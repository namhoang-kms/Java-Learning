package java_examples.java_oop.java_constructors;

public class ConstructorWithoutParameters {
    int x;  // Create a class attribute

    // Create a class constructor for the Main class
    public ConstructorWithoutParameters() {
        x = 5;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        ConstructorWithoutParameters myObj = new ConstructorWithoutParameters(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}
