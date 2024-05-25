package java_examples.thaochi_clair;

import java.io.OptionalDataException;

public class FresherTest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 5, 1, 6};
//        comparation1(arr);
        sortArray(arr);
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    static void comparation1(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max =" + max);
        System.out.println("min =" + min);
    }

    static void sortArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i+1; j <= arr.length - 1; j++) {
                if (arr[i] <= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        } System.out.println("max = " + arr[0]);
        System.out.println("max2 = " + arr[1]);
        System.out.println("min = " + arr[arr.length -1]);
        System.out.println("min2 = " + arr[arr.length -2]);
    }
}


