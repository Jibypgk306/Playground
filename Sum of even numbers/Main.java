import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            
        }
        System.out.println("Sum of even numbers "+sumE);
    }
}