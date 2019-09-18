package week8;

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
    }


    @Override
    public void setBookPrice() {
        bookPrice = 37.99;
    }
}
