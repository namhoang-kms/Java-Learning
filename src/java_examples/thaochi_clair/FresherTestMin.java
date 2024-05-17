package java_examples.thaochi_clair;

public class FresherTestMin {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 5, -11, 6};
        System.out.println(clairComparasionMin(arr));
    }

    static int clairComparasionMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}


//INPUT:
//int[] arr = {5, 2, 9, 1, 5, 6};
//OUTPUT: Print out the largest element in the array.
//EXPECTED -> 9