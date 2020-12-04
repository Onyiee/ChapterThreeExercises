package numberthreepointonethree;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee (String myFirstName, String myLastName, double myMonthlySalary){
        firstName = myFirstName;
        lastName = myLastName;
        if(myMonthlySalary > 0){
            monthlySalary = myMonthlySalary;
        }
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }

    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public double getYearlySalary(){
        return monthlySalary * 12;
    }

    public void getTenPercentIncrease(){
        monthlySalary = (0.1 * monthlySalary) + monthlySalary;
    }

}
