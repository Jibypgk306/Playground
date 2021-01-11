#include <iostream>
using namespace std;
class Addition {
public:
    int sum(int num1,int num2) {
        return num1+num2;
    }
    int sum(int num1,int num2, int num3) {
       return num1+num2+num3;
    }
};
int main(void) {
    Addition obj;
  int a,b,c;
  cin>>a>>b>>c;
    cout<<obj.sum(a,b)<<endl;
    cout<<obj.sum(a,b,c);
    return 0;
}