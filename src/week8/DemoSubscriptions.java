package week8;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewsPaperSubscription subscriptionOne = new PhysicalNewsPaperSubscription();
        OnlineNewsPaperSubscription subscriptionTwo = new OnlineNewsPaperSubscription();

        subscriptionOne.setName("Blimey");
        subscriptionOne.setAddress("Smith Street"); // Display error message
        subscriptionOne.setAddress("123 Smith Street");
        displaySubscription(subscriptionOne);

        subscriptionTwo.setName("Billy");
        subscriptionTwo.setAddress("jimmybob.my.jcu.edu.au"); // Display error message
        subscriptionTwo.setAddress("jimmybob@my.jcu.edu.au");
        displaySubscription(subscriptionTwo);
    }

    private static void displaySubscription(NewsPaperSubscription subscription) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("\nName: " + subscription.getName() + "\nAddress: " + subscription.getAddress() +
                "\nRate: $" + formatter.format(subscription.getRate()));
    }
}
