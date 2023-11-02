import java.util.Scanner;

public class Account {
    private int customerID;
    private int pinNumber;
    private double currentBalance = 0;
    private double savingBalance = 0;
    Scanner input = new Scanner(System.in);

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public int getPinNumber() {
        return this.pinNumber;
    }

    // Returns Current Account Balance
    public double getCurrentAccountBalance() {
        return this.currentBalance;
    }

    //Check Eligibilty for Withdraw money from Current Account and triggers deduct balance function
    public void withDrawFundsFromCurrent() {
        System.out.println("Current Account Balance : " + currentBalance);
        System.out.print("Please enter the amount you want to withdraw : ");
        double amount = input.nextDouble();

        if((currentBalance - amount) >= 0) {
            deductBalanceFromCurrent(amount);
            System.out.println("Current Account Balance after withdrawl : " + currentBalance);
        }
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    // Deduct current account balance
    public void deductBalanceFromCurrent(double amount) {
        currentBalance = currentBalance - amount;
    }

    public void depositFundsInCurrent() {
        System.out.print("Please enter the amount you want to deposit : ");
        double amount = input.nextDouble();

        if(amount >= 0) {
            currentBalance += amount;
            System.out.println("Current Account Balance after Deposits : " + currentBalance);
        }
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public double getSavingAccountBalance() {
        return this.savingBalance;
    }

    public void depositFundsInSavings() {
        System.out.print("Please enter the amount you want to deposit : ");
        double amount = input.nextDouble();

        if(amount >= 0) {
            savingBalance += amount;
            System.out.println("Savings Account Balance after Deposits : " + savingBalance);
        }
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void withDrawFundsFromSavings() {
        System.out.println("Savings Account Balance : " + savingBalance);
        System.out.print("Please enter the amount you want to withdraw : ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0) {
            deductBalanceFromSavings(amount);
            System.out.println("Savings Account Balance after withdrawl : " + savingBalance);
        }
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    // Deduct savings account balance
    public void deductBalanceFromSavings(double amount) {
        savingBalance = savingBalance - amount;
    }
}
