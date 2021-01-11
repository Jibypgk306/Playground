#include <iostream>
using namespace std;
int queue[20],front = - 1, rear = - 1;
void Insert(int n)
{
   int val=n;
   if (rear == n - 1)
   cout<<"Queue Overflow"<<endl;
   else 
   {
      if (front == - 1)
      front = 0;
      cin>>val;
      rear++;
      queue[rear] = val;
   }
}
void Display() {
   if (front == - 1)
   cout<<"Queue is empty"<<endl;
   else {
      cout<<"Queue elements are : "<<endl;
      for (int i = front; i <= rear; i++)
      cout<<queue[i]<<" ";
         cout<<endl;
   }
}
int main()
{
  int no,i;
  cin>>no;
  for(i=0;i<no;i++)
  {
     cout<<"Insert the element in queue : "<<endl;
    Insert(no);
  }
  Display();
  return 0;
}