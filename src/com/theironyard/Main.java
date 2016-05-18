package com.theironyard;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("What is your name?");

        ATM atm = new ATM();
        atm.chooseName();
        atm.chooseOption();
    }

}
