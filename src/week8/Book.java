package week8;

public abstract class Book {
    String bookTitle;
    double bookPrice;

    public Book(String title) {
        bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setBookPrice();
}
