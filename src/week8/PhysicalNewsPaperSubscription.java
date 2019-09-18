package week8;

public class PhysicalNewsPaperSubscription extends NewsPaperSubscription {

    @Override
    public void setAddress(String value) {
        int subscriptionRate = 15;
        int noSubscriptionRate = 0;
        String[] digitArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean hasDigit = false;

        for (String digit : digitArray) {
            if (value.contains(digit)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            address = value;
            setRate(subscriptionRate);
        } else {
            displayErrorMessage();
            setRate(noSubscriptionRate);
        }
    }

    public void displayErrorMessage() {
        System.out.println("Address must contain at least one digit..");
    }
}
