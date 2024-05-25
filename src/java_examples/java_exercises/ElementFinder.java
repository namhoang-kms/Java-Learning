package java_examples.java_exercises;

public class ElementFinder {
    public static void main(String[] args) {
        int[] numbers = {9, 2, 3, 8, 5, 1};
        sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("max=" + numbers[numbers.length - 1]);
        System.out.println("min=" + numbers[0]);
        System.out.println("max2nd=" + numbers[numbers.length - 2]);
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
