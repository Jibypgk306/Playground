import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
String str= sc.nextLine();
      int vowels=0;
		for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
        }
      System.out.print(vowels);  
    }
}