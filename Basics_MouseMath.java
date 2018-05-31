public class OneFour
{
  public static void main(String[] args)
  {
    double sweetKill = 0.25;
    double mWeight = 5;
    double dStartingWeight = 220;
    double desired = 195;
    double sodaSweet = 0.001;
    double killMouse = sweetKill/mWeight;
    double converter = killMouse * dStartingWeight;
    double death = converter/sodaSweet;

    System.out.println(death + " units would kill this person."); 
  }
}
