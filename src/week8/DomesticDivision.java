package week8;

public class DomesticDivision extends Division {
    String state;
    public DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }

    @Override
    void display() {
        System.out.println("\nName: " + name + "\nAccount Number: " + accountNumber + "\nState: " + state);

    }
}
