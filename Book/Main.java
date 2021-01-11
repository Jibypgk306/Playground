#include<iostream>
using namespace std;

  union Employee
       {
              
              char Name[50];
              int price;
    char book[50];
       };

       int main()
{

              Employee E;

                    cout<<"Enter the Book details"<<endl;
                    cout << "Enter the Book name"<<endl;
                    cin >> E.Name;

                    
                    cout << "Enter the Book price"<<endl;
                    cin >> E.price;

                    cout << "Book Details"<<endl<< E.Name;
                    cout <<" "<<  E.price<<endl;
         cout<<"Enter the Book name"<<endl;
         cin>>E.book;
cout<<"Book Name : "<<E.book;
       }
       
