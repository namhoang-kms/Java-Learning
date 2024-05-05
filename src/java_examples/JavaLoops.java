package java_examples;

public class JavaLoops {
    public static void main(String[] args) {
//        forLoop();
//        forLoop2();
//        nestedForLoop();
//        forEachLoop();
//        whileLoop();
        doWhileLoop();
    }

    public static void forLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void forLoop2() {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void nestedForLoop() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }

    public static void forEachLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 6;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
