package week8;

public class OutgoingPhoneCall extends PhoneCall {
    private int phoneCallMinutes;

    public OutgoingPhoneCall(String number, int phoneCallMinutes) {
        super(number);
        setCallPrice(0.04);
        setPhoneCallMinutes(phoneCallMinutes);
    }

    public void setPhoneCallMinutes(int value) {
        phoneCallMinutes = value;
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
        System.out.println("\nPhone Number: " + super.phoneNumber + "\nRate Per Minute: " + callPrice +
                "\nNumber of Minutes: " + phoneCallMinutes + "\nPrice of the call: " + callPrice * phoneCallMinutes);
    }
}
