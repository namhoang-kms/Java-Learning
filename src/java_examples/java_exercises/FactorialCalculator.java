package java_examples.java_exercises;

public class FactorialCalculator {

    public static void main(String[] args) {
        int n = 5;
        long result = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static long calculateFactorial(int n) {
        // Initialize the factorial variable to 1
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
