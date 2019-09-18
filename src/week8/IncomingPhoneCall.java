package week8;

public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String number) {
        super(number);
        setCallPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public double getCallPrice() {
        return super.callPrice;
    }

    @Override
    public void displayInformation() {
        System.out.println("\nPhone Number: " + super.phoneNumber + "\nRate Per Call: " + callPrice + "\nPrice of the call: " + callPrice );
    }
}
