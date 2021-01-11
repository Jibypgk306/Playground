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
    System.out.println("Registration");
    Customer Obj=new Customer();
    System.out.println("Enter your name");
    Obj.name=in.next();
    System.out.println("Enter your address");
    Obj.address=in.next();
    System.out.println("Contact Number");
    Obj.contactNumber=in.next();
    System.out.println("E-Mail ID");
    Obj.email=in.next();
    System.out.println("Enter proof type");
    Obj.proofType=in.next();
    System.out.println("Enter proof id");
    Obj.proofID=in.next();
    System.out.println("Customer Details");
    System.out.println(Obj.name);
    System.out.println(Obj.address);
    System.out.println(Obj.contactNumber);
    System.out.println(Obj.email);
    System.out.println(Obj.proofType);
    System.out.println(Obj.proofID);
    System.out.println("Thank you for registering. Your id is 1...");
  }
}