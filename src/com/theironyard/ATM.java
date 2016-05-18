package com.theironyard;

import static java.lang.Integer.valueOf;

/**
 * Created by Ben on 5/18/16.
 */
public class ATM {

    public void chooseName() throws Exception {
        String name = Main.scanner.nextLine();

        if (name.length()==0){
            throw new Exception("Or not.");
        }

    }

    public void chooseOption() throws Exception {
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");
        System.out.println("Enter the number of your desired option:");

        String options = Main.scanner.nextLine();

        if (options.equals("1")) {
            System.out.println("Your balance is $100");
        } else if (options.equals("2")) {
            System.out.println("How much to withdraw?");
            String amount = Main.scanner.nextLine();
            int amountInt = valueOf(amount);
            if (amountInt > 100) {
                throw new Exception("Not enough funds.");
            } else {
                System.out.println("Please remove withdrawal from slot");
            }
        } else if (options.equals("3")) {
            System.out.println("Thank you. Please come again!");
        } else {
            throw new Exception("Value entered not a valid option");
        }
    }
}
