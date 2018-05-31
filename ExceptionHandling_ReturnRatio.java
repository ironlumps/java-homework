import java.util.Scanner;
import java.util.InputMismatchException;

public class ReturnRatio
{
  // Constructor methods
  public ReturnRatio()
  {
    Scanner scan = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    double r = 0;
    boolean done = false;
    while(!done)
    {
  // try case
      try
      {
        System.out.println("Enter the first number: ");
        n1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        n2 = scan.nextInt();
        r = (double) n1/n2;
      // checks if denominator is zero and if it the exception is thrown
        if (n2 == 0)
        {
          throw new DivisionByZeroException();
        }
        done = true;
      }
      catch(InputMismatchException e)
      {
        scan.nextLine();
        System.out.println("Not an Integer");
      }
      catch(DivisionByZeroException e)
      {
        scan.nextLine();
        System.out.println(e.getMessage());
      }
      System.out.println("The result is: " + (double)n1/n2);
    }
  }


}
