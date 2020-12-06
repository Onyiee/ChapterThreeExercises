package numberthreepointoneseven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    HealthProfile myHealthProfile;

    @BeforeEach
    void setUp() {
        myHealthProfile = new HealthProfile("May", "Brown", "female", 13, 5, 2000, 50, 70);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToSetFirstName() {
        myHealthProfile.setFirstName("May");
        assertEquals("May", myHealthProfile.getFirstName());
    }


    @Test
    void testToGetFirstName() {
        String firstName = myHealthProfile.getFirstName();
        assertEquals("May", firstName);
    }

    @Test
    void testToSetLastName() {
        myHealthProfile.setLastName("Brown");
        assertEquals("Brown", myHealthProfile.getLastName());
    }

    @Test
    void testToGetLastName() {
        String lastName = myHealthProfile.getLastName();
        assertEquals("Brown", lastName);
    }

    @Test
    void testToCalculateUserAge() {
        int yearOfBirth = myHealthProfile.getYearOfBirth();
        int age = 2020 - yearOfBirth;
        assertEquals(age, myHealthProfile.calculateAge());
    }

    @Test
    void testToCalculateMaxHeartRate() {
        int maxHeartRate = myHealthProfile.calculateAge();
        maxHeartRate = 220 - myHealthProfile.calculateAge();
        assertEquals(maxHeartRate, myHealthProfile.calculateMaxHeartRate());
    }

    @Test
    void testGetTargetHeartRange(){
        int startHeartRange = (50 * myHealthProfile.calculateMaxHeartRate()) / 100;
        int endHeartRange = (85 * myHealthProfile.calculateMaxHeartRate()) / 100;
        String result = "Target Heart Range is between " + startHeartRange + " and " + endHeartRange;
        assertEquals(result, myHealthProfile.getTargetHeartRange());
    }

    @Test
    void testToCalculateBMI(){
        int weight = myHealthProfile.getWeight();
        int height = myHealthProfile.getHeight();
        int BMI = ( weight * 703)/( height * height);
        assertEquals(BMI, myHealthProfile.getBMI());
    }

}