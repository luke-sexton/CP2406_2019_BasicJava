package week4Refreshed;

public class Lease {

    private String tenantFirstName;
    private String tenantLastName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;

    // Initial-Value Constructor
    public Lease() {
        setTenantFirstName("");
        setTenantLastName("");
        setApartmentNumber(0);
        setMonthlyRent(0);
        setLeaseTerm(6);
    }

    //Setter Methods
    public void setTenantFirstName(String value) { this.tenantFirstName = value; }
    public void setTenantLastName(String value) { this.tenantLastName = value; }
    public void setApartmentNumber(int apartmentNumber) { this.apartmentNumber = apartmentNumber; }
    public void setMonthlyRent(double monthlyRent) { this.monthlyRent = monthlyRent; }
    public void setLeaseTerm(int leaseTerm) { this.leaseTerm = leaseTerm; }

    // Getter Methods
    public String getTenantFirstName() { return this.tenantFirstName; }
    public String getTenantLastName() { return this.tenantLastName; }
    public int getApartmentNumber() { return this.apartmentNumber; }
    public double getMonthlyRent() { return this.monthlyRent; }
    public int getLeaseTerm() { return this.leaseTerm; }

    public void addPetFee() {
        int fee = 10;
        setMonthlyRent(this.monthlyRent + fee);
        explainPetPolicy(fee);
    }

    private static void explainPetPolicy(int fee) {
        String message = "Policy states that monthly rent increases by $" + fee + " for having a pet.";
        System.out.println(message);
    }
}
