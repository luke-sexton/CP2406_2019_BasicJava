package week8;

public class BookArray {
    public static void main(String[] args) {
        Book[] bookArray = new Book[10];
        double fictionBook = 24.99;
        double nonFictionBook = 37.99;

        // Fill book array with assorted books
        for (int i = 0; i < bookArray.length; ++i) {
            if (i % 2 == 0) {
                bookArray[i] = new Fiction("Fiction Book");
            }
            else {
                bookArray[i] = new NonFiction("Non Fiction Book");
            }
        }

        int bookNumber = 1;
        // Display books in book array
        for (Book book : bookArray) {
            System.out.println("\nBook " + bookNumber + "\nTitle: " + book.getBookTitle() + "\nPrice: " + book.getBookPrice());
            bookNumber++;
        }

    }
}
