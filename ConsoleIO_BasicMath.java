import java.util.Scanner;

public class TwoThree
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int a = keyboard.nextInt();

    System.out.println("Enter the second number: ");
    int b = keyboard.nextInt();

    int sum = a + b;
    int diff = a - b;
    int prod = a * b;
    System.out.println("The sum of the two numbers is: " + sum);
    System.out.println("The difference is: " + diff);
    System.out.println("The product is: " + prod);
  }
}
