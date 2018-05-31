public class TestTruck
{
  public static void main(String[] args)
  {
    Truck a = new Truck("Ford", 8, new PersonB("John"), 250.00, 1500);

    Truck b = new Truck("Chevy", 6, new PersonB("James"), 450.00, 5000);

    System.out.println(a.equals(b));

    System.out.println(a.toString());
  }
}
