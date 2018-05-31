/*
Ryan Kassab
2296707
rkassab@chapman.edu
*/
import java.util.Scanner;

public class TowerOfHanoi
{
  public void solve(int n, String start, String temp, String end)
  {
    if (n == 1)
    {
      // returns the only operation if there is only one disc
      System.out.println(start + " -> " + end);
    }
    else
    {
      // otherwise the discs go through this recursive function to get
      // back to one
      solve(n - 1, start, end, temp);
      System.out.println(start + " -> " + end);
      solve(n - 1, temp, start, end);
    }
  }

  public static void main(String[] args)
  {
    TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
    System.out.print("Enter number of discs: ");
    Scanner scanner = new Scanner(System.in);
    int discs = scanner.nextInt();
    towersOfHanoi.solve(discs, "A", "B", "C");
  }
}
