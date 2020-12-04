package numberthreepointonesix;

import numberthreepointonefour.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;

public class HeartRates {
    String firstName;
    String lastName;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    String dateOfBirth;

    public HeartRates(String myFirstName,String myLastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        firstName = myFirstName;
        lastName = myLastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;
    }

    public void setFirstName(String theFirstName){
        firstName = theFirstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String theLastName){
        lastName = theLastName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public int ageCalculator(){
        int year = Year.now().getValue();
        int age = year - yearOfBirth;
        return age;
    }

    public int getMaxHeartRate(){

        return 220 - ageCalculator();
    }

    public String getTargetHeartRange(){
        int startHeartRange;
        int endHeartRange;
        int maxHeartRate = getMaxHeartRate();
        startHeartRange = (50 * maxHeartRate) /100;
        endHeartRange = (85 * maxHeartRate) /100;
        return "Target Heart Range is between " + startHeartRange + " and " + endHeartRange;
    }

}
