package src.java;

public class JavaArrays {
    public static void main(String[] args) {
        oneDimensionalArray();
        forLoopInDimensionalArray();
        forEachLoopInDimensionalArray();

        twoDimensionalArray();
        forLoopInTwoDimensionalArray();
        forEachLoopInTwoDimensionalArray();
    }

    public static void oneDimensionalArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); // Outputs Volvo

        cars[0] = "Opel";
        System.out.println(cars[0]); // Outputs Opel

        System.out.println(cars.length); // Outputs 4
    }

    public static void forLoopInDimensionalArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
    public static void forEachLoopInDimensionalArray() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void twoDimensionalArray() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9

        System.out.println(myNumbers.length); // Outputs 2
    }

    public static void forLoopInTwoDimensionalArray() {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }

    public static void forEachLoopInTwoDimensionalArray() {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
