import java.util.Scanner;

public class Fraction
{
  private int num;
  private int den;

  public Fraction()
  {
    setNum(1);
  }

  public int getNum()
  {
    return num;
  }
  public int getDen()
  {
    return den;
  }

  public void setNum(int num)
  {
    this.num = num;
  }
// checks if the denominator is zero within the mutator method
  public void setDen(int den) throws DenominatorIsZeroException
  {
    if (den == 0)
    {
      throw new DenominatorIsZeroException();
    }
    else
    {
      this.den = den;
    }
  }

  public String toString()
  {
    return num + "/" + den;
  }

}
