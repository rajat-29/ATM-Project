import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    public void getLogin() throws IOException {
        try {
            // Mapping of CustomerID and PinNumber
            data.put(987654, 321);
            data.put(123456, 789);

            System.out.println("Welcome to ATM :");
            System.out.println("Enter your Customer ID : ");
            setCustomerID(menuInput.nextInt());

            System.out.println("Enter your PIN Number : ");
            setPinNumber(menuInput.nextInt());

        } catch(Exception e) {
            System.out.println("Invalid Character(s), Please Input only Numbers");
        }

        int customerID = getCustomerID();
        int pinNumber = getPinNumber();

        if(data.containsKey(customerID) && data.get(customerID) == pinNumber) {

        }
        else {
            System.out.println("Wrong Customer ID or Pin Number, Please check again");
        }
    }
}
