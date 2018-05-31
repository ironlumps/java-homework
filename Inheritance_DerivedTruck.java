public class Truck extends Vehicle
{
  private double loading;
  private int towing;
//constuctor methods
  public Truck(String manufacturer, int cylinders, PersonB owner, double loading, int towing)
  {
    super(manufacturer, cylinders, owner);
    setLoading(loading);
    setTowing(towing);
  }
  public Truck(String manufacturer, int cylinders, PersonB owner, double towing)
  {
    super(manufacturer, cylinders, owner);
    setLoading(loading);
    setTowing(0);
  }
  public Truck(String manufacturer, int cylinders, PersonB owner)
  {
    super(manufacturer, cylinders, owner);
    setLoading(0.0);
    setTowing(0);
  }
// mutator methods
  public void setLoading(double loading)
  {
    this.loading = loading;
  }
  public void setTowing(int towing)
  {
    this.towing = towing;
  }
// accessor methods
  public double getLoading()
  {
    return loading;
  }
  public int getTowing()
  {
    return towing;
  }
//equals and toString methods
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
      Truck otherVehicle = (Truck)otherObject;
      return(this.getManufacturer().equals(otherVehicle.getManufacturer()) && this.getCylinders() == otherVehicle.getCylinders() && this.getOwner().equals(otherVehicle.getOwner()) && this.getLoading() == otherVehicle.getLoading() && this.getTowing() == otherVehicle.getTowing());
    }
  }

  public String toString()
  {
    return super.toString() + "  Loading Capacity: " + loading + "  Towing Capactiy: " + towing;
  }
}
