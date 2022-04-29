package com.example.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(200.00, 200.00);
        System.out.println(newAccount);

        //Normal Withdraw
        newAccount.withdrawFromChecking(100.00);
        newAccount.withdrawFromSaving(100.00);
        System.out.println(newAccount);

        //Check Neg amount
        newAccount.withdrawFromChecking(200.00);
        newAccount.withdrawFromSaving(200.00);
        System.out.println(newAccount);

        //Deposit
        newAccount.depositToChecking(100.00);
        newAccount.depositToChecking(200.00);
        newAccount.depositToSaving(100.00);
        newAccount.depositToSaving(200.00);

        System.out.println(newAccount);

        //Fee on Withdraw
        newAccount.withdrawFromChecking(51.00);
        newAccount.withdrawFromSaving(25.50);
        newAccount.withdrawFromChecking(50.55);
        newAccount.withdrawFromSaving(50.10);
        newAccount.withdrawFromChecking(50.10);
        newAccount.withdrawFromSaving(20.00);
        newAccount.withdrawFromChecking(50.00);
        newAccount.withdrawFromSaving(50.00);
        newAccount.withdrawFromChecking(40.00);
        newAccount.withdrawFromSaving(40.00);
        newAccount.withdrawFromChecking(2.00);

        //Final Account detail printout.
        System.out.println(newAccount);
    }
}
