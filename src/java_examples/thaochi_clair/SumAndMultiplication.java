package java_examples.thaochi_clair;

public class SumAndMultiplication {
    public static void main(String[] args) {
        myMethodSum();
        myMethodMulti();
    }

    public static void myMethodSum() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void myMethodMulti() {
        int multi = 1;
        for (int y = 1; y <= 10; y++) {
            multi *= y;
        }
        System.out.println(multi);
    }
}