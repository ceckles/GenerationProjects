package com.example.bank_app;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;


public class BankAccount {

    //Creating local variables
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;

    //Fee and daily transaction variables
    private final int maxDailyTransactions = 10;
    private final double fee = 1.00;
    private double feeCollection = 0.00;
    private int transaction = 0;

    //Currency Conversion Variables
    private Locale usa = new Locale("en", "US");
    private Currency dollar = Currency.getInstance(usa);
    private NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
    
    //Logger
    Logger LOG = new Logger();

    //Constructor
    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit){
        this.checkingBalance += checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;

    }
    //Withdraw from Checking and Savings methods
    public void withdrawFromChecking(double amount){
        if(transaction <= maxDailyTransactions){
            double pending = checkingBalance - amount;
            if (transaction >= 5){
                if(pending >= 0.00){
                    this.checkingBalance -= (amount + fee);
                    feeCollection += fee;
                    transaction++;//increment transaction
                    //System.out.println("Withdraw from Checking: " + dollarFormat.format(amount) +" fee: " + dollarFormat.format(fee) + " Total: " + dollarFormat.format((amount + fee)) + " New Balance: " + dollarFormat.format(this.checkingBalance));
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Withdraw from Checking: " + dollarFormat.format(amount) +" fee: " + dollarFormat.format(fee) + " Total: " + dollarFormat.format((amount + fee)) + " New Balance: " + dollarFormat.format(this.checkingBalance), LOG.BLINK,LOG.GREEN,LOG.WHITE);
                    LOG.endPrint();

                }else{
                    //System.out.println("Transaction canceled insufficient funds");
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Daily Transaction limit reached, try again tomorrow.", LOG.BLINK,LOG.RED,LOG.BLACK);
                    LOG.endPrint();
                }
            }else{
                if(pending >= 0.00){
                    this.checkingBalance -= amount;
                    transaction++;
                    //System.out.println("Withdraw from Checking: " + dollarFormat.format(amount) + " Total: " + dollarFormat.format(amount) + " New Balance: " + dollarFormat.format(this.checkingBalance));
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Withdraw from Checking: " + dollarFormat.format(amount) + " Total: " + dollarFormat.format(amount) + " New Balance: " + dollarFormat.format(this.checkingBalance), LOG.BLINK,LOG.GREEN,LOG.WHITE);
                    LOG.endPrint();
                }else{
                    //System.out.println("Transaction canceled insufficient funds");
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Transaction canceled insufficient funds", LOG.BLINK,LOG.RED,LOG.YELLOW);
                    LOG.endPrint();
                }
            }
        }else{
            //System.out.println("Daily Transaction limit reached, try again tomorrow.");
            LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
            LOG.print("Daily Transaction limit reached, try again tomorrow.", LOG.BLINK,LOG.RED,LOG.BLACK);
            LOG.endPrint();
        }
    }

    public void withdrawFromSaving(double amount){
        if(transaction <= maxDailyTransactions){
            double pending = savingsBalance - amount;
            if (transaction >= 5){
                if(pending >= 0.00){
                    this.savingsBalance -= (amount + fee);
                    feeCollection += fee;
                    transaction++;//increment transaction
                    //System.out.println("Withdraw from Checking: " + dollarFormat.format(amount) +" fee: " + dollarFormat.format(fee) + " Total: " + dollarFormat.format((amount + fee)) + " New Balance: " + dollarFormat.format(this.savingsBalance));
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Withdraw from Checking: " + dollarFormat.format(amount) +" fee: " + dollarFormat.format(fee) + " Total: " + dollarFormat.format((amount + fee)) + " New Balance: " + dollarFormat.format(this.savingsBalance), LOG.BLINK,LOG.GREEN,LOG.WHITE);
                    LOG.endPrint();
                }else{
                    //System.err.println("Transaction canceled insufficient funds");
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Transaction canceled insufficient funds", LOG.BLINK,LOG.RED,LOG.YELLOW);
                    LOG.endPrint();
                }
            }else{
                if(pending >= 0.00){
                    this.savingsBalance -= amount;
                    transaction++;
                    //System.out.println("Withdraw from Checking: " + dollarFormat.format(amount) + " Total: " + dollarFormat.format(amount) + " New Balance: " + dollarFormat.format(this.savingsBalance));
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Withdraw from Checking: " + dollarFormat.format(amount) + " Total: " + dollarFormat.format(amount) + " New Balance: " + dollarFormat.format(this.savingsBalance), LOG.BLINK,LOG.GREEN,LOG.WHITE);
                    LOG.endPrint();
                }else{
                    //System.out.println("Transaction canceled insufficient funds");
                    LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
                    LOG.print("Transaction canceled insufficient funds", LOG.BLINK,LOG.RED,LOG.YELLOW);
                    LOG.endPrint();
                }
            }
        }else{
            //System.out.println("Daily Transaction limit reached, try again tomorrow.");
            LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
            LOG.print("Daily Transaction limit reached, try again tomorrow.", LOG.BLINK,LOG.RED,LOG.BLACK);
            LOG.endPrint();
        }
    }

    //Deposit to Checking and Savings methods
    public void depositToChecking(double amount){
        this.checkingBalance += amount;
        //System.out.println("Deposit " + dollarFormat.format(amount) +" into Checking, Bal: " + dollarFormat.format(checkingBalance));
        LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
        LOG.print("Deposit " + dollarFormat.format(amount) +" into Checking, Bal: " + dollarFormat.format(checkingBalance), LOG.BLINK,LOG.CYAN,LOG.WHITE);
        LOG.endPrint();
    }
    //Deposit to Checking and Savings methods
    public void depositToSaving(double amount){
        this.savingsBalance += amount;
        //System.out.println("Deposit " + dollarFormat.format(amount) +" into Checking, Bal: " + dollarFormat.format(savingsBalance));
        LOG.setLogLevel(LOG.LOG_LEVEL_DEBUG);
        LOG.print("Deposit " + dollarFormat.format(amount) +" into Checking, Bal: " + dollarFormat.format(savingsBalance), LOG.BLINK,LOG.CYAN,LOG.WHITE);
        LOG.endPrint();
    }
    //Overriding the toString() method
    public String toString(){
        if(transaction <= 5){
            return "Checking Account Bal: " + dollarFormat.format(checkingBalance) + " Saving Account Bal: " + dollarFormat.format(savingsBalance);
        }else{
            return "Checking Account Bal: " + dollarFormat.format(checkingBalance) + " Saving Account Bal: " + dollarFormat.format(savingsBalance) + " Fee's applied: "+ dollarFormat.format(feeCollection);
        }
    }
}

