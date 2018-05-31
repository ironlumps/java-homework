/*
Ryan Kassab
2296707
rkassab@chapman.edu
CPSC 231-04
*/

public class Administrator extends SalariedEmployee
{
  private String title;
  private String responsibility;
  private String supervisor;

// constuctor methods
  public Administrator(String name, Date hireDate, double salary, String title, String responsibility, String supervisor)
  {
    super(name, hireDate, salary);
    setTitle(title);
    setResponsibility(responsibility);
    setSupervisor(supervisor);
  }
  public Administrator(String name, Date hireDate, double salary, String title, String responsibility)
  {
    super(name, hireDate, salary);
    setTitle(title);
    setResponsibility(responsibility);
    setSupervisor("Unknown");
  }
  public Administrator(String name, Date hireDate, double salary, String title)
  {
    super(name, hireDate, salary);
    setTitle(title);
    setResponsibility("Unknown");
    setSupervisor("Unknown");
  }
  public Administrator(String name, Date hireDate, double salary)
  {
    super(name, hireDate, salary);
    setTitle("Unknown");
    setResponsibility("Unknown");
    setSupervisor("Unknown");
  }

//accessor methods
  public String getTitle()
  {
    return title;
  }
  public String getResponsibility()
  {
    return responsibility;
  }
  public String getSupervisor()
  {
    return supervisor;
  }
// mutator methods
  public void setTitle(String title)
  {
    this.title = title;
  }
  public void setResponsibility(String responsibility)
  {
    this.responsibility = responsibility;
  }
  public void setSupervisor(String supervisor)
  {
    this.supervisor = supervisor;
  }

  // makes sure that the object being compared is the same class
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
      Administrator otherEmployee = (Administrator)otherObject;
      return(this.getName().equals(otherEmployee.getName()) && this.getHireDate().equals(otherEmployee.getHireDate()) && this.getSalary() == otherEmployee.getSalary() && this.getTitle().equals(otherEmployee.getTitle()) && this.getResponsibility().equals(otherEmployee.getResponsibility()) && this.getSupervisor().equals(otherEmployee.getSupervisor()));
    }
  }

  public String toString()
  {
    return super.toString() + "  Title: " + title + "  Responsibility: " + responsibility + "  Supervisor: " + supervisor;
  }
}
