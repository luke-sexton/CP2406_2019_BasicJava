import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DogTest {
    @Test
    void testDefault() {
        Dog dog = new Dog();
        assertNull(dog.name);
        assertEquals(0, dog.age);
        assertNull(dog.breed);
        assertNull(dog.shotStatus);


    }

}