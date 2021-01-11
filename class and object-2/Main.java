import java.util.*;
class Customer
{
  String name;
  String address;
  String contactNumber;
  String email;
  String proofType;
  String proofID;
};
  class Main
  {
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number of Customer");
    int n=in.nextInt();
    Customer Obj=new Customer();
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter the name");
    Obj.name=in.next();
    System.out.println("Enter the address");
    Obj.address=in.next();
    System.out.println("Enter the contact number");
    Obj.contactNumber=in.next();
    System.out.println("Enter the email");
    Obj.email=in.next();
    System.out.println("Enter the ProofType");
    Obj.proofType=in.next();
    System.out.println("Enter the proof ID");
    Obj.proofID=in.next();
    System.out.println("Registration Successfull");  
    System.out.println("Your Details:");
    System.out.println(Obj.name);
    System.out.println(Obj.address);
    System.out.println(Obj.contactNumber);
    System.out.println(Obj.email);
    System.out.println(Obj.proofType);
    System.out.println(Obj.proofID);
    System.out.println("Your id is "+(i+1));
    }
  }
  }