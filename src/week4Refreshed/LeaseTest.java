package week4Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeaseTest {
    @Test
    void testPetFee() {
        Lease lease = new Lease();

        lease.setTenantFirstName("Luke");
        lease.setTenantLastName("Sexton");
        lease.setApartmentNumber(21);
        lease.setMonthlyRent(1600);

        double monthlyRent = lease.getMonthlyRent();
        assertEquals(monthlyRent, 1600);

        System.out.println("Monthly Rent: " + monthlyRent);
        System.out.println("You have a pet..");

        lease.addPetFee();

        monthlyRent = lease.getMonthlyRent();
        assertEquals(monthlyRent, 1610);

        System.out.println("Monthly Rent: " + monthlyRent);
    }
}