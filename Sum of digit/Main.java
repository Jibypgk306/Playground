#include<iostream>
using namespace std;
class Digit
{
private: int num;
public:
void add()
{
int sum,r;
  cin>>num;
while(num!=0)
    {
        r=num%10;
        num=num/10;
        sum=sum+r;
    }
    cout<<sum;

}
};
int main()
{
Digit s;
s.add();
}