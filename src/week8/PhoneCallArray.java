package week8;

public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];
        int phoneCallMinutes = 5;
        for (int i = 0; i < phoneCalls.length; ++i) {
            if (i % 2 == 0) {
                phoneCalls[i] = new OutgoingPhoneCall("0427 428 447", phoneCallMinutes);
            } else {
                phoneCalls[i] = new IncomingPhoneCall("0485 603 218");
            }
            phoneCallMinutes += 1;
        }

        for (PhoneCall phoneCall : phoneCalls) {
            phoneCall.displayInformation();
        }
    }
}
