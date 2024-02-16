class BankAccountTester
{
    public static void main(String args[]) 
    {
        BankAccount tikeysus = new BankAccount(0, 20, "huge");
        BankAccount lukeysus = new BankAccount(0, 250, "massive");
        BankAccount.eTransfer(tikeysus, lukeysus, 500);
        System.out.println(tikeysus.getBalance());
        System.out.println(lukeysus.getBalance());
    }
}
