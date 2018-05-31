public class OneSix
{
  public static void main(String[] args)
  {
  double gear = 100.0 * (3.14);
  double cadence = 90.0;
  double feet = (1.0/12);
  double mile = (1.0/5280);
  double speed = gear * feet * mile * cadence * (60);
  System.out.println(speed);
  }
}
