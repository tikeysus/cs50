
public class BankAccount
{
    private double debt, balance;
    private String account_holder; 

    public BankAccount(double debt, double balance, String account_holder)
    {
        this.debt = debt;
        this.balance = balance;
        this.account_holder = account_holder;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getaccountHolder()
    {
        return account_holder;
    }

    public double getDebt()
    {
        return debt; 
    }

    public void withDraw(double amount) 
    {
        try 
        {
            if (amount <= balance && amount > 0) 
            {
                balance -= amount;
            } 
            else 
            {
                throw new InvalidWithdrawalAmountException("The withdrawal amount " + amount + " exceeds your balance.");
            }
        } 
        catch (InvalidWithdrawalAmountException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void deposit(double amount)
    {
        balance += amount; 
    }

    public static void eTransfer(BankAccount sender, BankAccount receiver, double amount)
    {
        try
        {
            if (amount < sender.getBalance())
            {
                sender.withDraw(amount);
                receiver.deposit(amount);
            }
            else
            {
                throw new InvalidWithdrawalAmountException("The withdrawal amount " + amount + " exceeds your balance.");
            }
        }
        catch (InvalidWithdrawalAmountException e)
        {
            System.out.println("Error: The " + sender.getaccountHolder() + " did not have enough money to send " + amount + " to the " + receiver.getaccountHolder());
        }
    }
}