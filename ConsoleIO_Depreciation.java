import java.util.Scanner;

public class TwoFive
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the purchase price of the item: ");
    double p = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter the expected years of service: ");
    int y = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter the expected salvage value: ");
    int s = keyboard.nextInt();

    double num = p - s;
    System.out.println("The average yearly depreciation of the item is: ");
    System.out.println(num/y);
  }
}
