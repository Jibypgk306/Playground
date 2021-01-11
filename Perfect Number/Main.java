#include <iostream>
using namespace std;
class AbstractionExample{
private:
  
   int num;
public:
   void setMyValues(int n) {
      num = n;
   }
   void getMyValues() {
     int i,rem,sum=0;
    for (i = 1; i <num; i++)
    {
        rem = num % i;
	if (rem == 0)
        {
            sum = sum + i;
        }
    }
    if (sum == num)
        cout<<"Yes";
    else
        cout<<"No";
   }
};
int main(){
  int a;
   AbstractionExample obj;
  cin>>a;
   obj.setMyValues(a);
   obj.getMyValues();
   return 0;
}