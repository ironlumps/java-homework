public class Vehicle
{
  private String manufacturer;
  private int cylinders;
  private PersonB owner;
//constuctor methods
  public Vehicle(String manufacturer, int cylinders, PersonB owner)
  {
    if (cylinders >= 1)
    {
      setManufacturer(manufacturer);
      setCylinders(cylinders);
      setOwner(owner);
    }
    else{
      System.out.println("Cylinder amount cannot exist");
    }
  }
  public Vehicle(String manufacturer, int cylinders)
  {
    this(manufacturer, cylinders, new PersonB());
  }
  public Vehicle(String manufacturer)
  {
    this(manufacturer, 1 , new PersonB());
  }
  public Vehicle()
  {
    this("Unknown", 1 , new PersonB());
  }
// mutator methods
  public void setManufacturer(String manufacturer)
  {
    this.manufacturer = manufacturer;
  }
  public void setCylinders(int cylinders)
  {
    this.cylinders = cylinders;
  }
  public void setOwner(PersonB owner)
  {
    this.owner = new PersonB(owner);
  }
// accessor methods
  public String getManufacturer()
  {
    return manufacturer;
  }
  public int getCylinders()
  {
    return cylinders;
  }
  public PersonB getOwner()
  {
    return owner;
  }
// equals and toString
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
      Vehicle otherVehicle = (Vehicle)otherObject;
      return(this.getManufacturer().equals(otherVehicle.getManufacturer()) && this.getCylinders() == otherVehicle.getCylinders() && this.getOwner().equals(otherVehicle.getOwner()));
    }
  }

  public String toString()
  {
    return "Manufacturer: " + manufacturer + "  Cylinders: " + cylinders + "  Owner: " + owner;
  }
}
