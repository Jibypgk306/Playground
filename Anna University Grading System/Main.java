import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int grade=s.nextInt();
  if(grade>=90 && grade<=99)
  {
    System.out.println("A");
  }
  else if(grade>=80 && grade<=89)
  {
    System.out.println("B");
}
  else if(grade>=70 && grade<=79)
  {
    System.out.println("C");
  }
  else if(grade>=60 && grade<=69)
  {
   System.out.println("D");
  }
  else if(grade>=50 && grade<=59)
  {
    System.out.println("E");
  }
  else if(grade<50)
  {
    System.out.println("F");
  }
  else
  {
    System.out.println("S");
  }
}
}