package java_examples;

public class JavaStrings {
    public static void main(String[] args) {
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        String firstName1 = "John";
        String lastName1 = "Doe";
        System.out.println(firstName1 + " " + lastName1); // Outputs "John Doe"

        String firstName2 = "John";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2)); // Outputs "JohnDoe"

        String firstName3 = "John";
        String lastName3 = "Doe";
        System.out.println(firstName3.concat(" ").concat(lastName3)); // Outputs "John Doe"

        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4); // Outputs "We are the so-called "Vikings" from the north."

        String txt5 = "It\'s alright.";
        System.out.println(txt5); // Outputs "It's alright."

        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6); // Outputs "The character \ is called backslash."

        String txt7 = "Hello\nWorld!";
        System.out.println(txt7); // Outputs "Hello" on one line and "World!" on the next line

        String txt8 = "Hello\rWorld!";
        System.out.println(txt8); // Outputs "World!" because the \r is a carriage return

        String txt9 = "Hello\tWorld!";
        System.out.println(txt9); // Outputs "Hello     World!" because the \t is a tab

        String txt10 = "Hello\bWorld!";
        System.out.println(txt10); // Outputs "HellWorld!" because the \b is a backspace

        String txt11 = "Hello\fWorld!";
        System.out.println(txt11); // Outputs "HelloWorld!" because the \f is a form feed
    }
}
