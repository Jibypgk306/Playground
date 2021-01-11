#include<iostream>
using namespace std;
int main()
{
  struct student
         {
              int subject1 ;
              int subject2 ;
              int subject3 ;
    			int subject4;
    			int subject5;
         };
               int i , n, total,r,g;
               float av ;
               struct student st[20];
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
               cout<<"Enter the no of students"<<endl;
               cin>>n;
  cout<<"rn"<<" "<< "s1"<<" "<<"s2"<<" "<<"s3"<<" "<<"s4"<<" "<<"s5"<<" "<<"avg"<<" "<<"grade"<<endl;

               for (i =0; i<n; i++)
                   {
                          total = 0 ;
       cin>>r;
                 
cin>> st[i].subject1 >>st[i].subject2>>st[i].subject3>>st[i].subject4>>st[i].subject5;
total = st[i].subject1+st[i].subject2+st[i].subject3+st[i].subject4+st[i].subject5;
av = total /5 ;
if(av>=70)
{
  g=1;
}
                 else if(av>50 && av<70)
                 {
                   g=2;
                 }
                 else
                 {
                   g=3;
                 }
cout<<r<<" "<<st[i].subject1<<" "<<st[i].subject2<<" "<<st[i].subject3<<" "<<st[i].subject4<<" "<<st[i].subject5;
cout<<" "<<av<<" "<<g<<endl;
            
                    }
}