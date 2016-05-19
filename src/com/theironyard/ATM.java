package com.theironyard;

import static java.lang.Integer.valueOf;

/**
 * Created by Ben on 5/18/16.
 */
public class ATM {

    String acctChoice;
    String name = Main.scanner.nextLine();
    int flag = 1;

    public void chooseName() throws Exception {



        if (name.length()==0){
            throw new Exception("Or not.");
        }
        if (Main.accounts.get(name) == null) {
            System.out.println("Account not found, would you like to create an account? [y/n]");
            acctChoice = Main.scanner.nextLine();
            if (acctChoice.equalsIgnoreCase("y")) {
                Main.accounts.put(name, 0.00);
            } else {
                System.out.println("Please open an account to utilize this ATM. Thank you.");
                flag = 0;
            }
        }

    }

    public void chooseOption() throws Exception {
        if (flag == 1){
            String options="0";
            while (!((options.equals("4")) || (options.equals("3")))) {
            System.out.println("Enter the number of your desired option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Close Account");
            System.out.println("4. Cancel");


            options = Main.scanner.nextLine();

                if (options.equals("1")) {
                    System.out.println("Your balance is $" + Main.accounts.get(name));
                } else if (options.equals("2")) {
                    System.out.println("How much to withdraw?");
                    String amount = Main.scanner.nextLine();
                    int amountInt = valueOf(amount);
                    if (amountInt > Main.accounts.get(name)) {
                        throw new Exception("Not enough funds.");
                    } else {
                        System.out.println("Please remove withdrawal from slot");
                    }
                } else if (options.equals("3")) {
                    Main.accounts.remove(name);
                    System.out.println("Account closed. Have a nice day.");
                } else if (options.equals("4")) {
                    System.out.println("Thank you. Please come again!");
                } else {
                    throw new Exception("Value entered not a valid option");
                }
            }
        }
    }
}
