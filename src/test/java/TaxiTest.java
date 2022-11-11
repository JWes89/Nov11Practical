import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiTest {
    private Taxi taxi;

    @BeforeEach
    public void setup() {
        taxi = new Taxi();
    }

    @Test
    public void isBookedTest() {
        boolean result = taxi.isBooked();
        assertEquals(true, result);
    }


//
//    @org.junit.jupiter.api.Test
//    void calcCost() {
//    }
}