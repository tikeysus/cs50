public class InvalidWithdrawalAmountException extends Exception
{
    public InvalidWithdrawalAmountException(String errorMessage)
    {
        super(errorMessage);
    }
}