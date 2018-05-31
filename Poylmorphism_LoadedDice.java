import java.util.Random;

public class LoadedDice extends Random
{
  public LoadedDice()
  {
    super();
  }

  public int nextInt(int num)
  {
    Random rand = new Random();
    int randnum = rand.nextInt(2) + 1;
    if (randnum == 1)
    {
      int answer = rand.nextInt(num) + 1;
      return answer;
    }
    else
    {
      int answer = num -1;
      return answer;
    }
  }
  public static void printDiceRolls(Random randGenerator)
  {
    for (int i = 0; i < 100; i++)
    {
      System.out.println(randGenerator.nextInt(6) + 1);
    }
  }
}
