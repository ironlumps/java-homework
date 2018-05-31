/*
Ryan Kassab
2296707
rkassab@chapman.edu
CPSC 231-04
Assignment #3
*/
import java.util.Scanner;

public class PracticeSeven
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first number you want to add: ");
    String first = keyboard.nextLine();
    System.out.println("Enter the second number you want to add: ");
    String second = keyboard.nextLine();

    // String first = Integer.toString(first);
    // String second = Integer.toString(second);

    first = reverse(first);
    second = reverse(second);

    int firstL = first.length();
    int secondL = second.length();

    char[] charFirst = first.toCharArray();
    char[] charSecond = second.toCharArray();

    System.out.println("The amount of places in the first are: " + firstL);
    System.out.println("The amount of places in the second are: " + secondL);

    int result = 0;
    int carryover = 0;
    int place = 1;
    int sum = 0;
    // converts the character array back to a string then
    // to a string array
    String strFirst = new String(charFirst);
    String[] strArrFirst = strFirst.split("");
    String strSecond = new String(charSecond);
    String[] strArrSecond = strSecond.split("");

    System.out.println("The reversed first number is: ");
    printArray(strArrFirst);
    System.out.println("The reversed second number is: ");
    printArray(strArrSecond);
    // tests which one is bigger by the amount of numbers they have
    int min = Math.min(firstL, secondL);
    int max = Math.max(firstL, secondL);
    for(int i = 0; i < min ; i++)
    {
      // converts the string array to integer and adds them
      sum = Integer.parseInt(strArrFirst[i]) + Integer.parseInt(strArrSecond[i]);
      sum = sum + carryover;
      if(sum == 10)
      {
        sum = 0;
        carryover = 1;
      }
      else if(sum > 10)
      {
        int tenth = sum/10;
        int oneth = sum % 10;
        carryover = tenth;
        sum = oneth;
      }
      else
      {
        carryover = 0;
      }
      sum = sum * (int)(Math.pow(10,i));
      result = result + sum;
      System.out.println(result);
      place = place * 10;
      sum = carryover;
      // fixes the problem of the last space
      if(i == min - 1)
      {
        result += carryover*(int)(Math.pow(10,i+1));
      }
    }
    System.out.println(result);
    if (max > min)
    {
      if (max == firstL)
      {
        for (int i = min; i < max; i++)
        {
          // this for loop and the next for loop make sure that
          // if the numbers aren't the same length it makes sure
          // the places dont get messed up
          sum = Integer.parseInt(strArrFirst[i]) + 0;
          sum = sum * (int)(Math.pow(10, i));
          result = result + sum;
        }
      }
      else
      {
        for(int i = min; i < max; i++)
        {
          sum = Integer.parseInt(strArrSecond[i]) + 0;
          sum = sum * (int)(Math.pow(10, i));
          result = result + sum;
        }
      }
    }
    if (max > 20)
    {
      System.out.println("Integer Overflow");
    }
    System.out.println("The result is: " + result);
  }
  // this method is unnecessary
  public static int reverse(int x) {
      int rev = 0;
      while(x != 0){
          rev = rev*10 + x%10;
          x = x/10;
      }
      return rev;
  }
  // reverses the String
  public static String reverse(String a)
  {
    String temp = "";
    for(int i = a.length() - 1; i >= 0; i--)
    {
      temp = temp + a.charAt(i);
    }
    return temp;
  }
  // this method is unnecessary
  public static void printArray(String[] a)
  {
    for(int i = 0; i < a.length; i++)
    {
      System.out.print(a[i]);
    }
    System.out.println();
  }
}
