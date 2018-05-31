public class Employee
{
  private String name;
  private Date hireDate;

  public Employee(String name, Date hireDate)
  {
    setName(name);
    setHireDate(hireDate);
  }
  public Employee(Employee other)
  {
    this(other.name, new Date(other.hireDate));
  }
  // clone constuctor
  public Employee clone()
  {
    return new Employee(this);
  }
  // accessor methods
  public String getName()
  {
    return name;
  }
  public Date getHireDate()
  {
    return hireDate;
  }
// mutator methods
  public void setName(String name)
  {
    this.name = name;
  }
  public void setHireDate(Date hireDate)
  {
    this.hireDate = new Date(hireDate);
  }
/*
  public boolean equals(Employee other)
  {
    return (this.name.equals(other.name) && this.hireDate.equals(other.hireDate));
  }
  */
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
      Employee otherEmployee = (Employee)otherObject;
      return(this.name.equals(otherEmployee.name) && this.hireDate.equals(otherEmployee.hireDate));
    }
  }
  public String toString()
  {
    return "Name: "+ name + "  Date Hired: " + hireDate;
  }
}
