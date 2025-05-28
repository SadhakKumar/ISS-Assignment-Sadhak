package com.sadhak.corejava.loopcontrol;

public class Main {
    public static void main(String[] args) {

        // Creating bank users with ATM pins, names, and initial balances
        BankUser user1 = new BankUser(1234, "Sadhak", 1000);
        BankUser user2 = new BankUser(5678, "Devangana", 2000);
        BankUser user3 = new BankUser(9101, "Taufique", 1500);

        // Array of bank users
        BankUser[] users = { user1, user2, user3 };

        // Create an ATM system with the users
        ATMSystem atmSystem = new ATMSystem(users);

        // Start the ATM system
        atmSystem.startATM();
    }
}
