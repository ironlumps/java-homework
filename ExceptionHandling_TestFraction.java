import java.util.Scanner;

public class TestFraction
{
  public static void main(String[] args)
  {
    try
    {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the numerator");
      int num = kb.nextInt();
      System.out.println("Enter the denominator");
      int den = kb.nextInt();
      Fraction f = new Fraction();
      f.setNum(num);
      f.setDen(den);
    }
    catch(DenominatorIsZeroException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
