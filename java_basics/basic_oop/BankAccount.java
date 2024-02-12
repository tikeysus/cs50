public class BankAccount
{
    private int debt, balance;
    private String account_holder; 

    public BankAccount(int debt, int balance, String account_holder)
    {
        this.debt = debt;
        this.balance = balance;
        this.account_holder = account_holder;
    }

    public int getBalance()
    {
        return balance;
    }
}