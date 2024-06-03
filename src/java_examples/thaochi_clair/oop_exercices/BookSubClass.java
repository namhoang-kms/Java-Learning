package java_examples.thaochi_clair.oop_exercices;

public class BookSubClass {
    String bookName;
    double bookPrice;
    int bookQuantity;
    String bookAuthor;


    @Override
    public String toString() {
        return "BookSubClass{" +
                "bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookQuantity=" + bookQuantity +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
