package java_examples.thaochi_clair;

import java.io.OptionalDataException;

public class FresherTest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("max=" + comparation1(arr));

    }

    static int comparation1(int[] arr) {
        int max = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}



//INPUT:
//int[] arr = {5, 2, 9, 1, 5, 6};
//OUTPUT: Print out the largest element in the array.
//EXPECTED -> 9