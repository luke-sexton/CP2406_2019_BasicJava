package week7;

public class DebugCustomerMakingPurchase extends DebugCustomer {
    private double amountOfPurchase;
    private boolean overLimit;

    public DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount) {
        super(id, name, credit);
        this.amountOfPurchase = purchAmount;
        if (this.amountOfPurchase > credit)
            this.overLimit = true;
        else
            this.overLimit = false;
    }

    @Override
    public void display() {
        System.out.println("Purchase amount $" + this.amountOfPurchase);
        if (this.overLimit)
            System.out.println("****Credit denied - customer over limit");
        else
            System.out.println("Purchase Okay");
    }
}
