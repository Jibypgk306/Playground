import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int range;
  //int* a1 = NULL;   // Pointer to int, initialize to nothing.
int size=s.nextInt();;
    // Read in the size
int []a1 = new int[size];
//System.out.println("enter elements");
for(int i=0;i<size;i++)
a1[i]=s.nextInt();
int max=a1[0];
      int min=a1[0];
for(int i=0;i<size;i++)
if(a1[i]>max)
{
max=a1[i];
}
      for(int i=0;i<size;i++)
if(a1[i]<min)
{
min=a1[i];
}
      range=max-min;
System.out.println("The range of the array is "+range);
}
}