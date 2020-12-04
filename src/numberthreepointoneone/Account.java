package numberthreepointoneone;

public class Account {
    private String name;
    private String pin;
    private String accountNumber;
    private double balance;

    public Account(String dName){
        name = dName;
    }
    public void setName(String myName){
        name = myName;
    }
    public String getName(){
        return name;
    }

    public void setBalance(double myBalance){
        balance = myBalance;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String myAccountNumber){
        accountNumber = myAccountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void withdraw(double money){
        if(balance< money){
            System.out.println("Withdrawal amount exceeded account balance");
        }else {
            balance = balance - money;
        }

    }

    public void deposit(double money){
        balance = balance + money;
    }




}
