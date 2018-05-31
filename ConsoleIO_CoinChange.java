import java.util.Scanner;

public class TwoSeven
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the price of the item (from 25 cents to 1 dollar in 5 cent increments): ");
    int price = keyboard.nextInt();
    keyboard.nextLine();
    int diff = 100 - price;
    int quarter = diff/25;
    int newDiff = (diff - (quarter * 25));
    int dime = newDiff/10;
    int newDiff2 = (newDiff - (dime * 10));
    int nickel = newDiff2/5;

    System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes and " + nickel + " nickels.");
  }
}
