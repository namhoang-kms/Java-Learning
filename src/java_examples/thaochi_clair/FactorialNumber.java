package java_examples.thaochi_clair;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 10;
        myMethodFactorial(n);
    }

    static void myMethodFactorial(int n) {
        int myFactorialresult = 1;
        for (int i = 1; i <= n; i++) {
            myFactorialresult *= i;
        }
        System.out.println(myFactorialresult);
    }

}
