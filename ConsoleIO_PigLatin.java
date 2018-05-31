import java.util.Scanner;

public class TwoTwo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your first name: ");
    String first = keyboard.nextLine();
    System.out.println("Enter your last name: ");
    String last = keyboard.nextLine();
    String first2;
    first2 = first.toLowerCase();
    String last2;
    last2 = last.toLowerCase();
    String pigFirst = first2.substring(1) + first2.substring(0,1) + "ay";
    String pigLast = last2.substring(1) + last2.substring(0,1) + "ay";
    System.out.println(pigFirst.substring(0,1).toUpperCase() + pigFirst.substring(1) + " " + pigLast.substring(0,1).toUpperCase() + pigLast.substring(1));
  }
}
