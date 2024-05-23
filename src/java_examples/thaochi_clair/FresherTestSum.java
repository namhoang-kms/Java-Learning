package java_examples.thaochi_clair;

public class FresherTestSum {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 5, 8, 10};
        int myTarget = 10;
        mySum10(arr, myTarget);
    }

    static void mySum10(int[] arr, int myTarget) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == myTarget) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                }
            }
        }
    }
}

