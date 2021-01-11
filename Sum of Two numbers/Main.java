#include<iostream>
using namespace std;
class A
{
 	public:
 	int x;
 	void getx()
    {
 	    cout << "Enter the integer value of class A: \n"; 
      cin >> x;
    }
};
class B
{
 	public:
 	int y;
 	void gety()
 	{
 	    cout << "Enter the integer value of class B: \n"; 
      cin >> y;
 	}
};
class C : public A, public B   //C is derived from class A and class B
{
 	public:
 	void sum()
 	{
 	    cout << "The sum of two numbers: " << x + y;
 	}
};

int main()
{
 	 C obj1; 
 	 obj1.getx();
 	 obj1.gety();
 	 obj1.sum();
 	 return 0;
}   	