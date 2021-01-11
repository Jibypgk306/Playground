import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
        int n, t1 = 0, t2 = 1, nextTerm = 0;

     n=s.nextInt();


    for (int i = 1; i <= n; ++i)
    {
        // Prints the first two terms.
        if(i == 1)
        {
            continue;
        }
        if(i == 2)
        {
            continue;
        }
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        
    }
         System.out.println( nextTerm +" ");


    }}