package java_examples;

public class JavaOperators {
    public static void main(String[] args) {
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)
        System.out.println("Sum3= " + sum3);


        int i =1;
        int j = i++;
        System.out.println("i= " + i);
        System.out.println("j= " + j);


        int k =1;
        int h = k++;
        System.out.println("k= " + k); // 2
        System.out.println("h= " + h); // 1

    }
}
