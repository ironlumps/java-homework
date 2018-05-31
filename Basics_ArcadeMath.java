public class OneTwo
{
  public static void main(String[] args)
  {
    int n = 59;
    int candy = 10;
    int gum = 3;
    int totalCandy = n/candy;
    int totalGum = (n - (totalCandy * candy))/3;
    System.out.println("You can get " + totalCandy + " candy bars and " + totalGum + " gumballs.");
  }
}
