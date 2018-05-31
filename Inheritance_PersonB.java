public class PersonB
{
  private String name;
// constructor methods
  public PersonB(String name)
  {
    setName(name);
  }
  public PersonB()
  {
    setName("Unknown");
  }
  public PersonB(PersonB object)
  {
    name = object.name;
  }
// accessor methods
  public String getName()
  {
    return name;
  }
// mutator methods
  public void setName(String name)
  {
    this.name = name;
  }
// equals and toString methods
  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
    {
      return false;
    }
    else if(getClass() != otherObject.getClass())
    {
      return false;
    }
    else {
      PersonB otherPerson = (PersonB)otherObject;
      return(this.getName().equals(otherPerson.getName()));
    }
  }
  public String toString()
  {
    return "Name: " + name;
  }
}
