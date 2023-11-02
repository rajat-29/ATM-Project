import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();
    int selection;

    // Login Functionality
    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
            // Mapping of CustomerID and PinNumber
            data.put(987654, 321);
            data.put(123456, 789);

            System.out.println("Welcome to ATM :");
            System.out.print("Enter your Customer ID : ");
            setCustomerID(menuInput.nextInt());

            System.out.print("Enter your PIN Number : ");
            setPinNumber(menuInput.nextInt());

            } catch(Exception e) {
                System.out.println("Invalid Character(s), Please Input only Numbers");
                x = 2;
            }

            int customerID = getCustomerID();
            int pinNumber = getPinNumber();

            if(data.containsKey(customerID) && data.get(customerID) == pinNumber) {
                getAccountType();
            }
            else {
                System.out.println("Wrong Customer ID or Pin Number, Please check again");
            }
        } while(x == 1);
    }

    // Display Account Type Menu with selection
    public void getAccountType() {
        System.out.println("Select the Account you want to access : ");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
        selection = menuInput.nextInt();

        switch(selection) {
            case 1 : 
                getCurrentAccount();
                break;

            case 2 :
                getSavingsAccounts();
                break;    

            case 3 :
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default :
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }

    public void getCurrentAccount() {
        System.out.println("Checking Account:  ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
        selection = menuInput.nextInt();

        switch(selection) {
            case 1 :
                System.out.println("Current Account Balance :" + getCurrentAccountBalance() + "\n");
                break;

            case 2 : 
                withDrawFundsFromCurrent();
                getAccountType();
                break;

            case 3 : 
                depositFundsInCurrent();
                getAccountType();
                break;

            case 4 :
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default : 
                System.out.println("\n" + "Invalid choice." + "\n");
                getCurrentAccount();
        }
    }

    public void getSavingsAccounts() {
        System.out.println("Savings Account:  ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
        selection = menuInput.nextInt();

        switch(selection) {
            case 1 :
                System.out.println("Saving Account Balance :" + getSavingAccountBalance() + "\n");
                break;

            case 2 : 
                withDrawFundsFromSavings();
                getAccountType();
                break;

            case 3 : 
                depositFundsInSavings();
                getAccountType();
                break;

            case 4 :
                System.out.println("Thank You for using this ATM, bye.");
                break;

            default : 
                System.out.println("\n" + "Invalid choice." + "\n");
                getCurrentAccount();
        }
    }
}
