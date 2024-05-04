package java_examples;

public class JavaMaths {
    public static void main(String[] args) {
        int max = Math.max(5, 10); // returns 10
        System.out.println("Max: " + max);

        int min = Math.min(5, 10); // returns 5
        System.out.println("Min: " + min);

        double sqrtOfNum = Math.sqrt(64); // returns 8.0
        System.out.println("Square root of 64: " + sqrtOfNum);

        double absNum = Math.abs(-4.7); // returns 4.7
        System.out.println("Absolute value of -4.7: " + absNum);

        double randomNum = Math.random(); // returns a random number between 0.0 and 1.0
        System.out.println("Random number: " + randomNum);

        double randomNum2 = Math.random() * 101; // returns a random number between 0.0 and 100.0
        System.out.println("Random number between 0.0 and 100.0: " + randomNum2);
    }
}
