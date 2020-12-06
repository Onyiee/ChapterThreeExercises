package numberthreepointoneseven;

import java.time.Year;

//(Computerization of Health Records) A health-care issue that has been in the news lately is
//the computerization of health records. This possibility is being approached cautiously because of
//sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//Computerizing health records could make it easier for patients to share their health profiles and histories
//among their various health-care professionals. This could improve the quality of health care,
//help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes
//should include the person’s first name, last name, gender, date of birth (consisting of separate
//attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//should have a constructor that receives this data. For each attribute, provide set and get methods.
//The class also should include methods that calculate and return the user’s age in years, maximum
//heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
//class HealthProfile for that person and prints the information from that object—including the person’s
//first name, last name, gender, date of birth, height and weight—then calculates and prints the
//person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//the BMI values chart from Exercise 2.33.
public class HealthProfile {
    String firstName;
    String lastName;
    String gender;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    String dateOfBirth;
    int height;
    int weight;

    public HealthProfile(String myFirstName, String myLastName, String myGender,int myDayOfBirth, int myMontOfBirth, int myYearOfBirth,int myWeight, int myHeight ){
        firstName = myFirstName;
        lastName = myLastName;
        gender = myGender;
        dateOfBirth = myDayOfBirth + "/" + myMontOfBirth + "/" + myYearOfBirth;
        dayOfBirth = myDayOfBirth;
        monthOfBirth = myMontOfBirth;
        yearOfBirth = myYearOfBirth;
        weight = myWeight;
        height = myHeight;
    }

    public void setLastName(String newLastName) {
         lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int calculateAge() {
        int currentYear = Year.now().getValue();
        int yearOfBirth = getYearOfBirth();
        int age = currentYear - yearOfBirth;
        return age;
    }

    public int calculateMaxHeartRate() {
        int maxHeartRate = 220 - calculateAge();
        return maxHeartRate;
    }

    public String getTargetHeartRange() {
        int startTargetHeartRange = (50 * calculateMaxHeartRate())/100;
        int endTargetHeartRange = (85 * calculateMaxHeartRate())/100;
        String targetHeartRange = ("Target Heart Range is between " + startTargetHeartRange + " and " + endTargetHeartRange);
        return targetHeartRange;
    }

    public int getBMI() {
        int BMI = ( weight * 703)/( height * height);
        return BMI;
    }
}
