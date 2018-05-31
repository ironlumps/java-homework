import java.util.Arrays;

public class TestStudent
{
  public static void main(String[] args)
  {
    Student a = new Student("Smith", 15);
    Student b = new Student("Guy", 29);
    Student c = new Student("Dude", 48);
    Student d = new Student("Bro", 24);
    Student e = new Student("Homie", 136);
    // puts the above students in an array
    Student[] studentArray = {a,b,c,d,e};
    // sorts the above array based on whichever code block is not commented out
    GeneralizedSelectionSort.generalSelectionSort(studentArray);
    for(int i = 0; i < studentArray.length; i++)
    {
      System.out.println(studentArray[i].getLastName() + " " + studentArray[i].getID());
    }
  }
}
