import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int number, i;
	Scanner	sc = new Scanner(System.in);
		
		number = sc.nextInt();	
		int x=sc.nextInt();
		i = number;
		
		while(i >=x)
		{
			System.out.println(i +" "); 
			i--;
		}	
	}
}