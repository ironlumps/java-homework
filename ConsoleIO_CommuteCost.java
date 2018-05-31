import java.util.Scanner;

public class TwoFour
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the distance of the commute: ");
    int dis = keyboard.nextInt();
    System.out.println("Enter the average fuel consumption of the car: ");
    int cons = keyboard.nextInt();
    System.out.println("Enter the price of gas per gallon: ");
    double fuel = keyboard.nextInt();

    double total = (dis/cons) * fuel;
    System.out.println("The cost of the commute would be: $" + total);
  }
}
