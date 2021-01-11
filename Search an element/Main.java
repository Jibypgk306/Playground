import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int []a1=new int[size];
		int flag = 0,i;
		for(i=0;i<size;i++)
		a1[i]=s.nextInt();
		int se=s.nextInt();
		for( i=0;i<size;i++)
		if(a1[i]==se)
		{
			flag = 1;
            break;
        }
        else
        {
            flag = 0;
        }
    if(flag == 1)
    {
        System.out.println(se+" is present in the array");
    }
    else
    {
        System.out.println(se+" is not present in the array");
    }

}
}