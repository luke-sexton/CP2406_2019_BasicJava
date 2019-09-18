package week8;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setBookPrice();
    }

    @Override
    public void setBookPrice() {
        super.bookPrice = 24.99;
    }
}
