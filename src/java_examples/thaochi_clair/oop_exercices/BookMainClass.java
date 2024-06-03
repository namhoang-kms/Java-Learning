package java_examples.thaochi_clair.oop_exercices;

import java.util.Scanner;

public class BookMainClass {
    public static void main(String[] args) {
        mostExpensivesBooks();
    }

    static BookSubClass input() {
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

        return myBookObj;
    }

    static void mostExpensivesBooks() {

        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("How many book do you want to input? ");
        int inputBook = myScannerObj.nextInt();
        BookSubClass[] bookArray = new BookSubClass[inputBook];

        for (int i = 0; i <= inputBook - 1; i++) {
            bookArray[i] = input();
        }

        for (BookSubClass book : bookArray) {
            System.out.println("Element of your Object is " + book);
        }

        BookSubClass bookMaxPrice = bookArray[0];
        for (int a = 1; a <= bookArray.length - 1; a++) {
            if (bookMaxPrice.getBookPrice() <= bookArray[a].getBookPrice()) {
                bookMaxPrice = bookArray[a];
            }

        }
        System.out.println("Most expensive book is" + bookMaxPrice);

        for (int a = 0; a <= bookArray.length - 1; a++) {
            if (bookArray[a].getBookName().equals("JAVA OOP")) {
                System.out.println("Book having name as JAVA OOP is " + bookArray[a]);
            }

        }

    }

}

