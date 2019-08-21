package week4Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillingTest {
    @Test
    void testOverloadMethods() {
        Billing billing = new Billing();

        double billOne = billing.computeBill(100.00);
        System.out.println(billOne);

        assertEquals(billOne, 108.00);

        double billTwo = billing.computeBill(100.00, 2);
        System.out.println(billTwo);

        assertEquals(billTwo, 216.00);

        double billThree = billing.computeBill(120.00, 2, 40.00);
        System.out.println(billThree);

        assertEquals(billThree, 216.00);


    }
}