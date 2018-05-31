public class OneFive
{
  public static void main(String[] args)
  {
    String sentence = "I hate discrete math.";
    int pos = sentence.indexOf("hate");
    String ending = sentence.substring(pos + "hate".length());
    System.out.println(sentence);

    sentence = sentence.substring(0, pos) + "love" + ending;
    System.out.println("The changed string is: ");
    System.out.println(sentence);
  }
}
