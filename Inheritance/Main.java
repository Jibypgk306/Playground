import java.util.*;
public class Main {
public static void main(String[] args)throws Exception {
Scanner sc=new Scanner(System.in);
String name;
 int age;
 char gender;
 long idNum;
 double cgpa;
 int year;
 String major;
 System.out.println("Name");
 name=sc.next();
 System.out.println("Age"); 
 age=sc.nextInt();
 System.out.println("Gender");
 gender=sc.next().charAt(0);
 System.out.println("ID Number");
 idNum=sc.nextLong();
 System.out.println("Major");
 major=sc.next();
 System.out.println("CGPA");
 cgpa=sc.nextDouble();
 System.out.println("Year");
 year=sc.nextInt();
 
CollegeStudent cs=new CollegeStudent(name,age,gender,idNum,cgpa,major,year);
System.out.println("The Student details is");
cs.toString();
System.out.println(cs);
}
}
class Student {
private String name;
private int age;
private char gender;
private long idNum;
private double cgpa;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Integer getAge() {
return age;
}
public void setAge(Integer age) {
this.age = age;
}
public char getGender() {
return gender;
}
public void setGender(char gender) {
this.gender = gender;
}
public long getIdNum() {
return idNum;
}
public void setIdNum(long idNum) {
this.idNum = idNum;
}
public double getCgpa() {
return cgpa;
}
public void setCgpa(double cgpa) {
this.cgpa = cgpa;
}
public Student(String name,int age,char gender,long idNum,double cgpa)
{
this.name=name;
this.age=age;
this.gender=gender;
this.idNum=idNum;
this.cgpa=cgpa;
}
}
class CollegeStudent extends Student{
 private String major;
 private int year;
public String getMajor() {
return major;
}
public void setMajor(String major) {
this.major = major;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
public CollegeStudent(String myName,int myAge,char myGender,long 
myIdNum,double myCGPA,String major,int year)
{
super(myName,myAge,myGender,myIdNum,myCGPA);
this.major=major;
this.year=year;
}
public String toString()
{
 return "ID : "+getIdNum()+"\nName : "+getName()+"\nAge : "+getAge()+"\nGender : "+getGender()+"\nMajor : "+major+"\nCGPA : "+getCgpa()+"\nYear : "+year;
}
}