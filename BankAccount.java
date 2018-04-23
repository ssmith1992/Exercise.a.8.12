package Week10.Exercise12;

//Add a toString method to the BankAccount class from the previous exercise. Your method should return a string that
//contains the account's name and balance separated by a comma and space. For example, if an account object named yana
//has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".


public class BankAccount
{
    private String name;
    private double balance;
    private double transactionFee;

    public BankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
        this.transactionFee = 0;
    }

    public void deposit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount)
    {
        if (this.balance - amount - this.transactionFee >= 0)
        {
            this.balance = this.balance - amount - this.transactionFee;
        }
        else
        {
            System.out.println("Not enough money, OP CANCELLED");
        }
    }

    public void setTransactionFee(double transactionFee)
    {
        this.transactionFee = transactionFee;
    }

    //  Exercise 12
    @Override
    public String toString()
    {
        return this.name + ", "  +  this.balance;
    }
}
