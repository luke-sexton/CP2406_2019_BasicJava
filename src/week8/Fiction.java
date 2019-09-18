package week8;

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
    }

    @Override
    public void setBookPrice() {
        bookPrice = 24.99;
    }
}
