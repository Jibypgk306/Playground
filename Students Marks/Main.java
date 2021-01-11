#include<iostream>
#include<stdio.h>
 
using namespace std;
class student
{
        int roll;
       
        public:
   
        void getdata()
        {
                cin>>roll;
       cout<<"Roll Number Is:"<<endl<<roll<<endl;
        }
};
class marks: public student
{
        int sub1;
        int sub2;
        int per;
        public:
 
    void input()
        {
                getdata();
               
                cin>>sub1;
                cin>>sub2;      
        }
        void output()
        {
                cout<<"Subject 1:"<<sub1<<endl;
                cout<<"Subject 2:"<<sub2<<endl;
        }
        void calculate ()
        {
                per= (sub1+sub2);
                cout<<"Total:"<<per<<"\n";
        }
};
 
int main()
{
        marks m1;
        int count=0;
       
                        m1.input();
                        m1.output();
                        m1.calculate();
}
