#include <iostream>
using namespace std;

int main()
{
  int L,B,Lp1,Bp1,Lp2,Bp2;
  cin>>L;
  cin>>B;
  cin>>Lp1;
  cin>>Bp1;
  cin>>Lp2;
  cin>>Bp2;
  if((L*B)>=((Lp1*Bp1)+(Lp2*Bp2)))
  {
    cout<<"Leonardo can fix both painting";
  }
  else
  {
    cout<<"Leonardo cannot fix both painting";
  }
  return 0;
}
