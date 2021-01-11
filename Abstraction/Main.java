#include <iostream>
using namespace std;
class AbstractionExample{
private:
  
   int num;
   int ch;

public:
   void setMyValues(int n, int c) {
      num = n; ch = c;
   }
   void getMyValues() {
     
      cout<<"a = "<<num<< endl;
      cout<<"b = "<<ch<<endl;
   }
};
int main(){
  int a,b;
   AbstractionExample obj;
  cin>>a>>b;
   obj.setMyValues(a,b);
   obj.getMyValues();
   return 0;
}