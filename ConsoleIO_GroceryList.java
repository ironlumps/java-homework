import java.util.Scanner;

public class TwoTen
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the name of item 1: ");
    String a1 = keyboard.nextLine();
    System.out.println("Enter the name of item 2: ");
    String a2 = keyboard.nextLine();
    System.out.println("Enter the name of item 3: ");
    String a3 = keyboard.nextLine();

    //keyboard.nextLine();

    System.out.println("Enter the quantity of item 1: ");
    int b1 = keyboard.nextInt();
    System.out.println("Enter the quantity of item 2: ");
    int b2 = keyboard.nextInt();
    System.out.println("Enter the quantity of item 3: ");
    int b3 = keyboard.nextInt();

    System.out.println("Enter the price of item 1: ");
    double c1 = keyboard.nextDouble();
    System.out.println("Enter the price of item 2: ");
    double c2 = keyboard.nextDouble();
    System.out.println("Enter the price of item 3: ");
    double c3 = keyboard.nextDouble();

    double total1 = b1 * c1;
    double total2 = b2 * c2;
    double total3 = b3 * c3;
    double subtotal = total1 + total2 + total3;
    double salestax = subtotal * 0.0625;
    double total = subtotal + salestax;

    System.out.println("Your bill: ");
    System.out.println("Item            Quantity          Price      Total" );
    System.out.println(a1 + "           " + b1 + "          " + c1 + "      " + total1);
    System.out.println(a2 + "           " + b2 + "          " + c2 + "      " + total2);
    System.out.println(a3 + "           " + b3 + "          " + c3 + "      " + total3);
    System.out.println("Subtotal                                            " + subtotal);
    System.out.println("Sales Tax                                           " + salestax);
    System.out.println("Total                                               " + total);
  }
}
