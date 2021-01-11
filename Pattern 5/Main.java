import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user

        int rows = scanner.nextInt();
        int k = 1;
        
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}