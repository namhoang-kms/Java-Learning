package java_examples.thaochi_clair;

public class WordNumber {
    public static void main(String[] args) {
        String x = " How  many white space in this phrase? ";
        x = x.trim().replaceAll("  ", " ");
        System.out.println(x);
        clairMethod(x);
    }

    static void clairMethod(String x) {
        String[] stringArrayAfterSplit = x.split(" ");
        System.out.println(stringArrayAfterSplit.length);
    }
}
