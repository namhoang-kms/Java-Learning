package java_examples.thaochi_clair.oop_exercices;

import java.util.Scanner;

public class BookMainClass {
    public static void main(String[] args) {
        input();
    }

    static void input() {
        Scanner myScannerObj = new Scanner(System.in);

        BookSubClass myBookObj = new BookSubClass();
        System.out.println("Please input name of the book.");
        String bookName = myScannerObj.nextLine();
        myBookObj.setBookName(bookName);
        System.out.println("Please input name of the book's author. ");
        String bookAuthor = myScannerObj.nextLine();
        myBookObj.setBookAuthor(bookAuthor);
        System.out.println("Please input the price of the book.");
        double bookPrice = myScannerObj.nextDouble();
        myBookObj.setBookPrice(bookPrice);
        System.out.println("Please input quantity of the book.");
        int bookQuantity = myScannerObj.nextInt();
        myBookObj.setBookQuantity(bookQuantity);


        System.out.println(myBookObj.toString());

    }
}
