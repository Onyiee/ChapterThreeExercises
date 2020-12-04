package numberthreepointoneone;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account myAccount = new Account("Femi");
        System.out.println("Enter name: ");
        String name = scan.nextLine();

        System.out.println("Enter account number: ");
        String accountNumber = scan.nextLine();

        System.out.println("Enter your balance: ");
        double balance = scan.nextDouble();

        System.out.println("Enter deposit amount: ");
        double depositAmount = scan.nextDouble();

        System.out.println("Enter withdrawal amount: ");
        double withdrawalAmount = scan.nextDouble();

        myAccount.setName(name);
        myAccount.setBalance(balance);
        myAccount.setAccountNumber(accountNumber);
        myAccount.deposit(depositAmount);
        myAccount.withdraw(withdrawalAmount);


        System.out.printf("%s Your account balance is now:  %f",myAccount.getName(), myAccount.getBalance());



    }
}
