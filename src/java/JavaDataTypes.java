package src.java;

public class JavaDataTypes {
    public static void main(String[] args) {
        byte myByteNum = 120;                           // from -128 to 127
        short myShortNum = 3276;                        // from -32768 to 32767
        int myIntNum = 21474836;                        // from -2147483648 to 2147483647
        long myLongNum = 922337203685477L;              // from -9223372036854775808 to 9223372036854775807
        float myFloatNum = 5.99f;                       // floating point number, the precision of float is only six or seven decimal digits
        double myDoubleNum = 5.99d;                     // double point number, double variables have a precision of about 15 digits
        char myLetter = 'D';                            // character
        boolean myBool = true;                          // boolean (true or false)
        String myText = "Hello World";                  // String

        System.out.println("DataType - byte: " + myByteNum);
        System.out.println("DataType - short: " + myShortNum);
        System.out.println("DataType - int: " + myIntNum);
        System.out.println("DataType - long: " + myLongNum);
        System.out.println("DataType - float: " + myFloatNum);
        System.out.println("DataType - double: " + myDoubleNum);
        System.out.println("DataType - char: " + myLetter);
        System.out.println("DataType - boolean: " + myBool);
        System.out.println("DataType - String: " + myText);
    }
}
