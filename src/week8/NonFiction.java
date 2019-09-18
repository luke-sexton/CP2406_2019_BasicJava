package week8;

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setBookPrice();
    }


    @Override
    public void setBookPrice() {
        super.bookPrice = 37.99;
    }
}
