#include <iostream>
using namespace std;
class A {
public:
  void disp()
  {
      int a;
cin>>a;
     cout<<a<<endl;
  }
};
class B: public A{
public:
  void disp(){
    float b;
    cin>>b;
     cout<<b;
  }
};
int main() {
  //Parent class object
  A obj;
  obj.disp();
  //Child class object
  B obj2;
  obj2.disp();
  return 0;
}