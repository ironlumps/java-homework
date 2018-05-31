/*
Ryan Kassab
2296707
rkassab@chapman.edu
*/
public class BinarySearch
{
  public static int binarySearch(int[] a, int first, int last, int key)
  {
    if(last >= 1)
    {
      int mid = first + (last - first)/2;
      // if the key just so happens to be in the middle, then it just returns that
      if(a[mid] == key)
      {
        return mid;
      }
      if(a[mid] > key)
      {
        // recursively does the problem again with new parameters
        return binarySearch(a, first, mid -1, key);
      }
      else
      {
        // recursively does the problem again if the key is less than the mid
        // which means some parameters stay the same
        return binarySearch(a, mid + 1, last, key);
      }
    }
    return -1;
  }

  public static void main(String[] args)
  {
    BinarySearch bs = new BinarySearch();
    int a[] = {1,5,6,8,9,15,50};
    int key = 6;
    int result = bs.binarySearch(a,0,a.length,key);
    if(result == -1)
    {
      System.out.println("Element Not Found.");
    }
    else
    {
      System.out.println("Element Found At Index " + result);
    }
  }
}
