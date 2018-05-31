public class TestDice
{
  public static void main(String[] args)
  {
    LoadedDice myDice = new LoadedDice();
    printDiceRolls(myDice);
  }

  public static void printDiceRolls(LoadedDice randGenerator)
  {
    for (int i = 0; i < 100; i++)
    {
      System.out.println(randGenerator.nextInt(6) + 1);
    }
  }
}
