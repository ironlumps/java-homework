public class YearException extends Exception
{
  public YearException()
  {
    super("Invalid Year");
  }
  public YearException(String message)
  {
    super(message);
  }
}
