package numberthreepointonesix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {
    HeartRates myHeartRates;
    @BeforeEach
    void setUp() {
        myHeartRates  = new HeartRates("Mofe","Jamal",27,1,1998);
        System.out.println("in before each " + myHeartRates.getLastName());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ageCalculator() {
        assertEquals(22,myHeartRates.ageCalculator());
    }
    @Test
    void setLastName(){
        myHeartRates.setLastName("test");
        assertEquals("test",myHeartRates.getLastName());
    }

    @Test
    void getLastName(){
        assertEquals("Jamal", myHeartRates.getLastName());
    }
    @Test
    void getTargetHeartRange(){
        int startHeartRange = (50 * myHeartRates.getMaxHeartRate()) /100;
        int endHeartRange = (85 * myHeartRates.getMaxHeartRate()) /100;
        String expectedString = "Target Heart Range is between " + startHeartRange + " and " + endHeartRange;
        assertEquals(expectedString, myHeartRates.getTargetHeartRange());
    }
}
