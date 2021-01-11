#include<iostream>
using namespace std;
class Patient
{
  public:
  char name[20];
  int bno,ward;
  void patientdata()
  {
    cout<<"Enter Data";
    cout<<"\nEnter Patient Name : ";
    cin>>name;
    cout<<"\nEnter Bed Number : ";
    cin>>bno;
    cout<<"\nEnter Ward Name : ";
    cin>>ward;
  }
  void put()
  {
    cout<<"\nInserted Data";
    cout<<"\nPatient Name : "<<name;
    cout<<"\nBed Number : "<<bno;
    cout<<"\nWard Name : "<<ward;
  }
};
class Doctor:public Patient
{
public:
char Dname[20],degree[10];
int total;
void Ddetail()
{
cout<<"\nEnter the Doctor Name :";
cin>>Dname;
cout<<"\nEnter Doctorate Degree :";
cin>>degree;
cout<<"\nEnter Dues of Patient :";
cin>>total;
}
void putD()
{
cout<<"\nDoctor Name : "<<Dname;
cout<<"\nDoctorate Degree : "<<degree;
cout<<"\nTotal Dues of Patient : "<<total;
}
};
int main()
{
  Doctor c;
  c.patientdata();
  c.Ddetail();
    c.put();
c.putD();
}