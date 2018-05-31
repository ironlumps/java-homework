import java.util.*;
import java.util.Arrays;

public class SixSix
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a series of numbers seperated by spaces: ");
    String user = keyboard.nextLine();
    String[] userArr = user.split(" ");
    //new array to convert the String array into an int array
    int[] newArr = new int[userArr.length];
    for(int i = 0; i < userArr.length; i++)
    {
      newArr[i] = Integer.parseInt(userArr[i]);
    }

    reverseSort(newArr);

    System.out.printf("%-10s%-10s\n", "N", "Count");

    //counting # of times the number occurs
    int counter = 1;
    for (int i = 0; i < newArr.length; i++)
    {
      if (i < newArr.length - 1)
      {
        if (newArr[i] == newArr[i + 1])
        {
          counter++;
        }
      }
      else
      {
        System.out.printf("%-10d%-10d\n", newArr[i], counter);
      }
      if (i < newArr.length - 1 && newArr[i] != newArr[i + 1])
      {
        System.out.printf("%-10d%-10d\n", newArr[i], counter);
        counter = 1;
      }
    }
  }
  //this method will take in an array and sorts it
  public static void reverseSort(int a[])
  {
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (a[i] * -1);
    }
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (a[i] * -1);
    }
  }
}
