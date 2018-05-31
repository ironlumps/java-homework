public class OneThree
{
  public static void main(String[] args)
  {
  String first = "ryan";
  String last = "kassab";
  String pigFirst = first.substring(1) + first.substring(0,1) + "ay";
  String pigLast = last.substring(1) + last.substring(0,1) + "ay";
  System.out.println(pigFirst.substring(0,1).toUpperCase() + pigFirst.substring(1) + " " + pigLast.substring(0,1).toUpperCase() + pigLast.substring(1));
  }
}
