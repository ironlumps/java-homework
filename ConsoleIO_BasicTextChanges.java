import java.util.Scanner;

public class TwoEight
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the line of text: ");
    String a = keyboard.nextLine();

    System.out.println("This is the text in uppercase: " + a.toUpperCase());
    System.out.println("This is the text in lowercase: " + a.toLowerCase());
    
  }
}
