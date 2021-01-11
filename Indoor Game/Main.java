#include <iostream>
using namespace std;
class Addition {
public:
    int area(int num1) {
        return num1*num1;
    }
    int area(int num2, int num3) {
       return num2*num3;
    }
};
int main(void) {
    Addition obj;
  int a,b,c;
  cin>>a>>b>>c;
    cout<<obj.area(a)<<endl;
    cout<<obj.area(b,c);
    return 0;
}