public class DenominatorIsZeroException extends Exception
{
  public DenominatorIsZeroException()
  {
    super("Denominator is Zero.");
  }

  public DenominatorIsZeroException(String message)
  {
    super(message);
  }
}
