import java.util.Scanner;

public class DateOrganization
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    int month = 0;
    int year = 0;
    int day = 0;
// each boolean is for each of the while loops, done for the big one and
// y for year and m for month
    boolean done = false;
    boolean y = false;
    boolean m = false;
// loops through in case there an exception is triggered
    while(!done)
    {
      // try loop for the exception catching
      try
      {
        // this while loop makes sure that the year doesn't get retriggered if
        // an exception is triggered later
        while(!y)
        {
          System.out.println("Enter the year: ");
          year = kb.nextInt();
          if(year > 3000 || year < 1000)
          {
            throw new YearException();
          }
          y = true;
        }
        // this while loop makes sure that the month doesn't get retriggered if
        // an exception is triggered later
        while(!m)
        {
          System.out.println("Enter the month: ");
          month = kb.nextInt();
          if (month > 12 || month < 1)
          {
            throw new MonthException();
          }
          m = true;
        }
        System.out.println("Enter the day: ");
        day = kb.nextInt();
        // this switch statement goes through all the months individually
        // and checks if the day is possible
        switch(month)
        {
          case 1:
                  if(day > 31 || day < 1)
                  {
                    throw new DayException();
                  }
          case 2:
                  int count = 0;
                  for(int i = 2000; i < 3001; i += 4)
                  {
                    if (year == i)
                    {
                      count = 1;
                      break;
                    }
                  }
                  if (count != 1)
                  {
                    if (day > 28 || day < 1)
                    {
                      throw new DayException();
                    }
                  }
                  else
                  {
                    if(day > 29 || day < 1)
                    {
                      throw new DayException();
                    }
                  }
          case 3:
                  if (day > 31 || day < 1)
                  {
                    throw new DayException();
                  }
          case 4:
                  if (day > 30 || day < 1)
                  {
                    throw new DayException();
                  }
          case 5:
                if (day > 31 || day < 1)
                {
                  throw new DayException();
                }
          case 6:
                if (day > 30 || day < 1)
                {
                  throw new DayException();
                }
          case 7:
                if (day > 31 || day < 1)
                {
                  throw new DayException();
                }
          case 8:
                if (day > 31 || day < 1)
                {
                  throw new DayException();
                }
          case 9:
                if (day > 30 || day < 1)
                {
                  throw new DayException();
                }
          case 10:
                if (day > 31 || day < 1)
                {
                  throw new DayException();
                }
          case 11:
                if (day > 30 || day < 1)
                {
                  throw new DayException();
                }
          case 12:
                if (day > 31 || day < 1)
                {
                  throw new DayException();
                }
        }
        done = true;
        // the series of if statements checks the month and prints the
        // correct corresponding date
        if(month == 1)
        {
          System.out.println("January " + day + ", " + year);
        }
        if(month == 2)
        {
          System.out.println("February " + day + ", " + year);
        }
        if(month == 3)
        {
          System.out.println("March " + day + ", " + year);
        }
        if(month == 4)
        {
          System.out.println("April " + day + ", " + year);
        }
        if(month == 5)
        {
          System.out.println("May " + day + ", " + year);
        }
        if(month == 6)
        {
          System.out.println("June " + day + ", " + year);
        }
        if(month == 7)
        {
          System.out.println("July " + day + ", " + year);
        }
        if(month == 8)
        {
          System.out.println("August " + day + ", " + year);
        }
        if(month == 9)
        {
          System.out.println("September " + day + ", " + year);
        }
        if(month == 10)
        {
          System.out.println("October " + day + ", " + year);
        }
        if(month == 11)
        {
          System.out.println("November " + day + ", " + year);
        }
        if(month == 12)
        {
          System.out.println("December " + day + ", " + year);
        }
      }
      catch(DayException e)
      {
        System.out.println(e.getMessage());
      }
      catch(MonthException e)
      {
        System.out.println(e.getMessage());
      }
      catch(YearException e)
      {
        System.out.println(e.getMessage());
      }
    }
  }
}
