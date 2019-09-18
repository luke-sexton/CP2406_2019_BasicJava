package week8;

public class OnlineNewsPaperSubscription extends NewsPaperSubscription {

    @Override
    public void setAddress(String value) {
        int subscriptionRate = 9;
        if (value.contains("@")) {
            address = value;
            setRate(subscriptionRate);
        } else {
            displayErrorMessage();
        }
    }

    public void displayErrorMessage() {
        System.out.println("Address must contain the @ symbol..");
    }
}
