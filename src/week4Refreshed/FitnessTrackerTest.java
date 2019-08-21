package week4Refreshed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FitnessTrackerTest {

    @Test
    void defaultTest() {
        FitnessTracker fitnessTracker = new FitnessTracker();

        Boolean status = fitnessTracker.getIsRunning();
        System.out.println(status);
        assertEquals(status, true);

        String date = fitnessTracker.getDate();
        System.out.println(date);
        assertEquals(date, "January 1 2019");

        double runningTime = fitnessTracker.getRunningTime();
        System.out.println(runningTime);
        assertEquals(runningTime, 0.00);
    }

    @Test
    void testInitialValueConstructor() {
        FitnessTracker fitnessTracker = new FitnessTracker(true, "January 2 2019", 10.00);

        Boolean status = fitnessTracker.getIsRunning();
        System.out.println(status);
        assertEquals(status, true);

        String date = fitnessTracker.getDate();
        System.out.println(date);
        assertEquals(date, "January 2 2019");

        double runningTime = fitnessTracker.getRunningTime();
        System.out.println(runningTime);
        assertEquals(runningTime, 10.00);



    }

}