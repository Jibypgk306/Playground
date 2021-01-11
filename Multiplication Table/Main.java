import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
         int num, end;
	 num=s.nextInt();
	end=s.nextInt();
	int i;
	for(i = 1; i <= end; i++)
	{
		System.out.println( i + "*" +num + "=" +num*i);
	}
}
}