public class Student implements Comparable<Student>
{
  private String lastName;
  private int iD;
// Constructor methods
  public Student(String lastName, int iD)
  {
    setLastName(lastName);
    setID(iD);
  }
  public Student(String lastName)
  {
    setLastName(lastName);
    setID(0);
  }
  public Student()
  {
    setLastName("Unknown");
    setID(0);
  }
// accessor methods
  public String getLastName()
  {
    return lastName;
  }
  public int getID()
  {
    return iD;
  }
// mutator method
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public void setID(int iD)
  {
    this.iD = iD;
  }
// This compareTo method is comparing the two IDs of the Students
  public int compareTo(Student other)
  {
    if (this.getID() < other.getID())
    {
      return -1;
    }
    else if (this.getID() == other.getID()) {
      return 0;
    }
    else
    {
      return 1;
    }
  }

  // This commented out block of code is the compareTo method for the last names
  // of the students
 /* public int compareTo(Student other)
  {
    if(this.getLastName().compareTo(other.getLastName()) < 0)
    {
      return -1;
    }
    else if (this.getLastName().compareTo(other.getLastName()) == 0) {
      return 0;
    }
    else
    {
      return 1;
    }
  }*/
}
