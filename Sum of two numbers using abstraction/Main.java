#include<iostream>
using namespace std;
class Sample_Class {
int a,b;
public:
    int sum=0;

virtual void sample_func() = 0;
void print_func() {
  cin>>a>>b;
  sum=a+b;
}
};
class Derived_Class : public Sample_Class {
public:
void sample_func() {
cout << "Sum: "<<sum;
}
};
int main() {
Derived_Class d_object;
  d_object.print_func();
d_object.sample_func();
}