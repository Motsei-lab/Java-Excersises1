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
        System.out.println("Balance: R" + this.accBalance);
        if(amount > 0 ){
            amount = amount + this.accBalance;
            System.out.println("Balance after deposit: R"+ amount);
        }
        else{
            System.out.println("Can't deposit nothing");
        }




    }

    public void withdraw(double amount){
        System.out.println("Balance: R" + this.accBalance);
    if(amount >0 & amount<= this.accBalance)
    {
        this.accBalance = this.accBalance - amount;
        System.out.println("balance after a withdrawl of R" + amount +" is: R" + this.accBalance);
    }
    else{
        System.out.println("Insufficient funds");
    }
    }

    public void getBalance(){
        System.out.println("Current balance is: R" + this.accBalance);

    }
}
