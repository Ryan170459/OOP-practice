package com.accounts;
import java.util.Scanner;
public class accountClass {
    public int accountNumber;
    private float balance;

    public accountClass(int accountNumber ,float balance){
        this.accountNumber =accountNumber;
        this.balance = balance;
    }

    public void set_accountNumber(int _accountNumber) {
        this.accountNumber = _accountNumber;
    }

    public int get_accountNumber() {
        return accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return balance;
    }

    public void checkBalance(){
        System.out.println("Account Number:"+ get_accountNumber());
        System.out.println("Current balance:"+ getBalance());
    }

public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input account number:");
        int accountNumber= scanner.nextInt();

        System.out.println("Input balance:");
        float  Balance= scanner.nextFloat();

        accountClass account1=new accountClass(accountNumber,Balance);
        account1.checkBalance();
}
}
