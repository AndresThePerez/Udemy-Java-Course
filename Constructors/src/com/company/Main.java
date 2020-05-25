package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bank = new BankAccount();

        System.out.println(bank.getBalance());

    }
}

class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(123, 200, "NO_NAME", "NO_EMAIL", 888888888);
    }

    public BankAccount(int number, double balance, String name, String email, int phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int number) {
        this.balance += number;
        System.out.println("desposited! new balance is " + balance);
    }
    public void withdrawFunds(int number) {
        if(number > this.balance) {
            System.out.println("Insufficient Funds! Your current balance is only " + this.balance + " you cannot withdraw " + number);
        } else {
            this.balance -= number;
        }
    }
}
