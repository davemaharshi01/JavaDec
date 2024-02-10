package Assignment;

import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    int balance;

    Scanner sc = new Scanner(System.in);

    public BankAccount(int acNumber, String acHolder, int acBalance){
        this.accountNumber = acNumber;
        this.accountHolderName = acHolder;
        this.balance = acBalance;
    }

    public void deposit(){
        int amount;
        System.out.println("Please Deposit the amount you want to Deposit:");
        amount = sc.nextInt();
        balance += amount;
        System.out.println("Your New Balance is: "+ balance);
    }

    public void withdraw(){
        int withdraw;
        System.out.println("Please type the amount you want to withdraw:");
        withdraw = sc.nextInt();
        balance -= withdraw;
        System.out.println("Your new Balance is: "+ balance);
    }

    public void printStatement(){
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Balance: "+ balance);
    }
}
