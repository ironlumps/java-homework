public class TestAdministrator
{
  public static void main(String[] args)
  {
    Date d = new Date(22, 8, 1999);
    Administrator a = new Administrator("John", d, 15.00, "Manager", "To Manage", "Supervisor");

    Date d2 = new Date(9, 3, 1998);
    Administrator b = new Administrator("James", d2, 16.00, "Supervisor", "To Supervise", "Boss");

    System.out.println(a.equals(b));
    System.out.println(a.toString());
  }
}
