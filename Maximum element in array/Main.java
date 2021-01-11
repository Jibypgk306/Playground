import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i;
        int[] arr=new int[n];
      for(i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
    int max = recursiveMax(arr, arr.length);
    System.out.println("Maximum element in the array is " + max);
  }
 
  static int recursiveMax(int[] arr, int length)
  {
    if (length == 1)
      return arr[0];
    return max(recursiveMax(arr, length - 1), arr[length - 1]);
  }
 
  private static int max(int n1, int n2)
  {
    return n1 > n2 ? n1 : n2;
  }	
}