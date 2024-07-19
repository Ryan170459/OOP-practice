package com.accounts;

public class SavingsAccountextendsAccount extends accountClass{

        private double interest;


        public SavingsAccountextendsAccount(int _accountNumber, float balance, double interest) {
            super(_accountNumber, balance);
            this.interest = interest;
        }

    @Override
    public void set_accountNumber(int _accountNumber) {
        super.set_accountNumber(_accountNumber);
    }


    public void setInterest(double interest) {
        this.interest = interest;
    }


    public double getInterest() {
        return interest;
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("The Interest is  "+getInterest());
    }
}

