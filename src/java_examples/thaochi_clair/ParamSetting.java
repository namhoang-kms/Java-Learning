package java_examples.thaochi_clair;

public class ParamSetting {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        int z = 20;
        int k = 8;
        int t = myCalculator(x, y);
        System.out.println(t);
        int a = myCalculator(x, y, z);
        System.out.println(a);
        int b = myCalculator(x, y, z, k);
        System.out.println(b);

    }

    static int myCalculator(int x, int y) {
        return (x + y);
    }

    static int myCalculator(int x, int y, int z) {
        return (x + y + z);
    }

    static int myCalculator(int x, int y, int z, int k) {
        return (x + y + z + k);
    }
}
