import java.util.Scanner;
class Main
{
  static int arr[] ; 
    static int findSum(int A[], int N) 
    { 
        if (N <= 0) 
            return 0; 
        return (findSum(A, N - 1) + A[N - 1]); 
    } 
  
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
        System.out.println("The sum of the elements in the array is "+findSum(arr, arr.length)); 
    }
}