import java.util.Scanner;

public class OneOne
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    double weight = (150.0/2.2);
    int run = 10;
    int bas = 8;
    int sleep = 1;
    int met = (10*30)+(8*30)+(1*360);
    double calorie = 0.0175 * met * weight;
    System.out.println(calorie);

  }
}
