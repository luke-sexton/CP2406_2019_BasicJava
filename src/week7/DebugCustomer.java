package week7;

public class DebugCustomer
{
    private int idNumber;
    private String name;
    private double creditLimit;

    public DebugCustomer(int id, String name, double credit)
    {
       this.idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + this.idNumber +
          " Name: " +  this.name + "\nCredit limit $" + this.creditLimit);
    }
}
