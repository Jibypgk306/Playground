#include<iostream>
using namespace std;
int main()
{
  struct employee
         {
         string name ;
              int empid ;
              int subject3 ;
    			int age;
    			string desg;
    int salary;     
         };
               
               struct employee st[20];
  string name ;
              int empid ;
              int subject3 ;
    			int age;
    			string desg;
    int salary;
  cout<<"Enter name:"<<endl;
cout<<"Enter ID:"<<endl;
cout<<"Enter age:"<<endl;
cout<<"Enter designation:"<<endl;
cout<<"Enter Salary:"<<endl;
  cout<<"Employee Details"<<endl;
               cin>>name;
  cin>>empid;
  cin>>age;
  cin>>desg;
  cin>>salary;     
cout<<"Name of the Employee : "<<name<<endl;
  cout<<"ID of the Employee : "<<empid<<endl;
  cout<<"Age of the Employee : "<<age<<endl;
  cout<<"Designation of the Employee : "<<desg<<endl;
  cout<<"Salary of the Employee : "<<salary<<endl;
                    }
