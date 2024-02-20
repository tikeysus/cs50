import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class BankAccount
{
    private double debt, balance;
    private int id;
    private String account_holder; 
    private Map<String, Integer> accountIds = new HashMap<>();


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

    public int getaccountId(String account_holder)
    {   
        int id;
        Random random = new Random();
        StringBuilder accountid = new StringBuilder();
        if (accountIds.containsKey(account_holder))
        {
            return accountIds.get(account_holder); 
        }
        
        else
        {
        do {
        for (int i = 0; i < 6; i ++)
        {
            accountid.append(random.nextInt(10)); //generates six random integers for the account id. 
        }
        id = Integer.parseInt(accountid.toString());
        } while (accountIds.containsValue(id));

        accountIds.put(account_holder, id);
        return id; 
        }
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