package numberthreepointonethree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("bisi", "Ola", 300);
        Employee employee1 = new Employee("Ayo", "Dele", 500);

        System.out.printf("yearly salary of %s is %.2f%n", myEmployee.getFirstName(), myEmployee.getYearlySalary() );
        System.out.printf("yearly salary of %s is %.2f%n", employee1.getFirstName(), employee1.getYearlySalary() );

        myEmployee.getTenPercentIncrease();
        employee1.getTenPercentIncrease();
        System.out.printf("yearly salary of %s after 10%% increase is %.2f%n",myEmployee.getFirstName(), myEmployee.getYearlySalary() );
        System.out.printf("yearly salary of %s after 10%% increase is %.2f%n",employee1.getFirstName(), employee1.getYearlySalary() );
    }
}
