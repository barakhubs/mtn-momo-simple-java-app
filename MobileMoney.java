import java.util.Scanner;

/*
 * This is a simple mobile money application
 * for leanring purposes
 */
public class MobileMoney {
    public static void main(String[] args) {
        // static variables
        // Dynamically these variable values can be stored in the database
        // That will be done in the future updates
        final String code           = "*185#"; // code to start momo
        final String pincode        = "12345"; // pin code
        final String phoneNumber    = "0773034311"; // number to receive money
        final String name           = "Baraka Mark Bright" ; // name of the receiver
        final int balance           = 50000; // balance in the account;

        // variables
        String enteredPinCode; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("****** MOBILE MONEY ******");
        System.out.println("Enter code to start mobile money");

        String codeEntered = scanner.nextLine();
        
        if (codeEntered.equals(code)) {

            System.out.println("Select an option to continue");
            System.out.println("1-Send Money");
            System.out.println("2-Check Balance");

            String option = scanner.nextLine();

            // check the option selected
            if(option.equals("1")) {

                System.out.println("Enter phone number");

                String enteredPhoneNumber = scanner.nextLine();

                // check if phone number is valid and then proceed if  true
                if (enteredPhoneNumber.equals(phoneNumber)) {
                    // continue to send money
                    System.out.println("Enter amount");

                    int enteredAmount = scanner.nextInt();

                    // check if amount is less or equal to the balance
                    if (enteredAmount <= balance) {
                        // let the sender confirm the recipient's number
                        System.out.println("You are sending " + enteredAmount + " to " + name + "\n Enter pin code to continue");

                        String newPin = scanner.nextLine();

                        // check if pin code entered matches
                        if (newPin.equals(pincode)) {
                            // send money here
                            System.out.println("You have send " + enteredAmount + " to " + name + " successfully! \n Thank you for choosing MTN Mobile Money");
                        } else {
                            System.out.println("Incorrect pin code. Please try again");
                        }
                        
                    } else {

                        System.out.println("You have insufficient balance!");

                    }

                } else {
                    // print our error message
                    System.out.println("Phone number does not exist! Try again");
                }

            } else if(option.equals("2")) {

                System.out.println("Enter pin code to continue");

                enteredPinCode = scanner.nextLine();
                
                // check if pin code is correct
                if(enteredPinCode.equals(pincode)) {

                    System.out.println("Your account balance is: " + balance);

                }else {

                    System.out.println("Incorrect pin code. Try again!");

                }
            } else {

                System.out.println("Unknown option selected. Try again");

            }

        } else {

            System.out.println("Code does not exist. Please try again!");

        }
        

    }
}
