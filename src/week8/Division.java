package week8;

public abstract class Division {
    protected String name;
    protected int accountNumber;

    public Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    abstract void display();
}
