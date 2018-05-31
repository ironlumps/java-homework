public class SalariedEmployee extends Employee
{
  private double salary;

// constructor method
  public SalariedEmployee(String name, Date hireDate, double salary)
  {
    super(name, hireDate);
    setSalary(salary);
  }

  //accessor methods
  public double getSalary()
  {
    return salary;
  }

  //mutator method
  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public double getPay()
  {
    return salary;
  }
  public String toString()
  {
    return super.toString() + "  Salary: $" + salary;
  }
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
      SalariedEmployee otherEmployee = (SalariedEmployee)otherObject;
      return(this.getName().equals(otherEmployee.getName()) && this.getHireDate().equals(otherEmployee.getHireDate()));
    }
  }

  public static void main(String[] args)
  {
    // main method
  }
}
