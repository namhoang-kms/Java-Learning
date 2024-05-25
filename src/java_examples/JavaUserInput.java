package java_examples;

import java.util.Scanner;

public class JavaUserInput {

    public static void main(String[] args) {
        getUserInputMultipleValues();
    }

    public static void getUserInputMultipleValues() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void getUserInputSingleValue() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name:");
        // String input
        String name = myObj.nextLine();
        // Output input by user
        System.out.println("Name: " + name);
    }

    public static void getUserInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

