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

    public abstract void getPhoneNumber();

    public abstract void getCallPrice();

    public abstract void displayInformation();
}
