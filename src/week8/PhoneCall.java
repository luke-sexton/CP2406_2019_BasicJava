package week8;

public abstract class PhoneCall {
    String phoneNumber;
    double callPrice = 0.0;

    public PhoneCall(String number) {
        phoneNumber = number;
    }

    public void setCallPrice(double value) {
        callPrice = value;
    }

    public abstract String getPhoneNumber();

    public abstract double getCallPrice();

    public abstract void displayInformation();
}
