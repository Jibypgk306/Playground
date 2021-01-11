#include<iostream>
using namespace std;

  union Employee
       {
              int Id;
              char Name[25];
              int Age;
              long Salary;
       };

       int main()
{

              Employee E;

                    cout<<"Enter the Employee details"<<endl;
                    cout << "Enter the Employee name :"<<endl;
                    cin >> E.Name;

                    
                    cout << "Enter the Employee salary :"<<endl;
                    cin >> E.Salary;

                    cout << "Employee Details"<<endl<< E.Name;
                    cout <<" "<<  E.Salary;

       }
       
