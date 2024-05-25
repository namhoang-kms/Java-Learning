package java_examples.java_exercises;

public class FindPairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 5, 5, 3};
        int target = 10;
        findPairWithSum(arr, target);
    }

    public static void findPairWithSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "," + j);
                }
            }
        }
        System.out.println("No pair found");
    }
}