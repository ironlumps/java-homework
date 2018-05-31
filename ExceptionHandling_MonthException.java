public class MonthException extends Exception
{
  public MonthException()
  {
    super("Month Invalid");
  }
  public MonthException(String message)
  {
    super(message);
  }
}
