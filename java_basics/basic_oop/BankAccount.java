
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

    public void withDraw(double amount) throws InvalidWithdrawalAmountException
    {
        if (amount <= balance && amount > 0)
        {
            balance -= amount;
        }
        else
        {
            throw new InvalidWithdrawalAmountException("The withdrawl amount " + amount + " exceeds your balance. ");
        }
    }

    public void deposit(double amount)
    {
        balance += amount; 
    }
}