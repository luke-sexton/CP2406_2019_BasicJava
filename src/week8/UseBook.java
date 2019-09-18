package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("I am Fiction");
        NonFiction nonFictionBook = new NonFiction("I am Non Fiction");

        displayBook(fictionBook);
        displayBook(nonFictionBook);

    }
    private static void displayBook(Book book) {
        System.out.println(book.getBookTitle() + ": $" + book.getBookPrice());
    }
}
