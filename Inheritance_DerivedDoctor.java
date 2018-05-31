public class Doctor extends SalariedEmployee
{
  private String special;
  private double fee;
// constuctor methods
  public Doctor(String name, Date hireDate, double salary, String special, double fee)
  {
    super(name, hireDate, salary);
    setSpecial(special);
    setFee(fee);
  }
  public Doctor(String name, Date hireDate, double salary, String special)
  {
    super(name, hireDate, salary);
    setSpecial(special);
    setFee(0.0);
  }
  public Doctor(String name, Date hireDate, double salary)
  {
    super(name, hireDate, salary);
    setSpecial("Unknown");
    setFee(0.0);
  }
// accessor methods
  public String getSpecial(String special)
  {
    return special;
  }
  public double getFee(double fee)
  {
    return fee;
  }
// mutator methods
  public void setSpecial(String special)
  {
    this.special = special;
  }
  public void setFee(double fee)
  {
    this.fee = fee;
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
      Doctor otherEmployee = (Doctor)otherObject;
        return(this.getName().equals(otherEmployee.getName()) && this.getHireDate().equals(otherEmployee.getHireDate()) && this.getSalary() == otherEmployee.getSalary() && this.getSpecial().equals(otherEmployee.getSpecial()) && this.getFee() == otherEmployee.getFee());
    }
  }

  public String toString()
  {
    return super.toString() + "  Speciality: " + special + "  Fee: $" + fee;
  }
}
