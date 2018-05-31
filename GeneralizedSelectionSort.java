public class GeneralizedSelectionSort
{
  public static void generalSelectionSort(Comparable[] a)
  {
    for(int i = 0; i <a.length; i++)
    {
      swap(a, i, smallest(a, i));
    }
  }

  public static void swap(Comparable[] a, int i1, int i2)
  {
    Comparable temp = a[i1];
    a[i1] = a[i2];
    a[i2] = temp;
  }

  public static int smallest(Comparable[] a, int start)
  {
    int smallest = start;
    for(int i = start; i < a.length; i++)
    {
      if(a[i].compareTo(a[smallest]) < 0)
      {
        smallest = i;
      }
    }
    return smallest;
  }
}
