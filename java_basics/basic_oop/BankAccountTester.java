class BankAccountTester
{
    public static void main(String args[]) 
    {
        BankAccount my_account = new BankAccount(45, 400, "Lukey");
        System.out.println(my_account.getBalance());
        my_account.deposit(400);
        System.out.println(my_account.getBalance());
        try
        {
            my_account.withDraw(1000);
        }
        catch (InvalidWithdrawalAmountException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(my_account.getBalance());
    }
}
