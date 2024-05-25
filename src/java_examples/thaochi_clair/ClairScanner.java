package java_examples.thaochi_clair;

import java.util.Scanner;

public class ClairScanner {
    public static void main(String[] args) {
        clairArray();
    }
    public static void clairArray() {
        Scanner myArrayObj = new Scanner(System.in);
        System.out.println("How many room do you like to have in this array dear?");
        int n = myArrayObj.nextInt();
        if (n <= 0) {
            System.out.println("Room's number must be greater than 0.");
            System.out.println("How many room do you like to have in this array dear?");
            n = myArrayObj.nextInt();
        }
        System.out.println("How many room do you like to have in this array dear?");
        n = myArrayObj.nextInt();
        if (n > 0) {
            int[] arrNull = new int[n];
            for (n = 0; n <= arrNull.length - 1; n++) {
                System.out.println("Please enter your index " + n);
                arrNull[n] = myArrayObj.nextInt();

            }
            String arrString = "";
            for (int i = 0; i <= arrNull.length - 1; i++) {
                arrString += arrNull[i] + ", ";
            }
            arrString = arrString.trim() + "\b";
            System.out.print("{" + arrString + "}");
        }
    }
}


