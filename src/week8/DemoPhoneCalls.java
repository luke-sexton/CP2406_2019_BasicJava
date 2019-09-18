package week8;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incoming = new IncomingPhoneCall("0427 428 447");
        OutgoingPhoneCall outgoing = new OutgoingPhoneCall("0427 428 447", 10);

        incoming.displayInformation();
        outgoing.displayInformation();
    }
}
