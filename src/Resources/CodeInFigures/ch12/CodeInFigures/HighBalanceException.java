package Resources.CodeInFigures.ch12.CodeInFigures;

public class HighBalanceException extends Exception
{
   public HighBalanceException()
   {
      super("Customer balance is high");
   }
}
