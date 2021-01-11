#include<iostream>
using namespace std;

class base {
public:
    base() {
      cout<<"Base class constructor"<<endl;
    }
    virtual ~base()=0;
};

// Provide a definition for destructor.
base::~base() 
{
  
}

class derived:public base {
  int x;
public:
    derived(int i) {
      x=i;
    cout<<"Derived class constructor"<<endl;
            cout<<"The given input is "<<x;

    }
    ~derived(){}
};

int main() {
  int y;
  cin>>y;
    derived pDerived(y);
}