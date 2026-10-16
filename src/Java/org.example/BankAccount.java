/*
Create a BankAccount class with private fields for account holder, account number, and balance.
 Add a constructor and methods: - deposit(double amount) - withdraw(double amount) - getBalance()
A deposit or withdrawal must be greater than zero.
A withdrawal cannot exceed the balance. Invalid operations must not change the balance. Test valid and invalid transactions.
 */
package org.example;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double accBalance;

    public BankAccount(String accountHolder, String accountNumber, double accBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accBalance = accBalance;
    }

    public void deposit(double amount){

        if(amount > 0 ){
            this.accBalance = this.accBalance + amount;
            System.out.println("Balance after deposit: R"+ amount);
        }
        else{
            System.out.println("Can't deposit nothing");
        }




    }

    public void withdraw(double amount){

    if(amount<= this.accBalance)
    {
        this.accBalance = this.accBalance - amount;
        System.out.println("Withdrawl amount of R" + amount );
    }
    else{
        System.out.println("Insufficient funds");
    }
    }

    public void getBalance(){
        System.out.println("Current balance is: R" + this.accBalance);

    }
}
