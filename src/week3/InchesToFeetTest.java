package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InchesToFeetTest {
    @Test
    void checkFootCalculation() {
        InchesToFeet inchesToFeet = new InchesToFeet();
        assertEquals(1, inchesToFeet.footCalculation);
    }

    @Test
    void checkDisplayFootLength() {
        InchesToFeet inchesToFeet = new InchesToFeet();

        inchesToFeet.displayFootLength(inchesToFeet.inches);
        assertEquals(7, inchesToFeet.footCalculation);
        assertEquals(2, inchesToFeet.remainingInches);

    }
}
