#include<iostream>
using namespace std;
void convert10tob(int N, int b)
{
     if (N == 0)
        return;
     int x = N % b;
     N = N/b;
     convert10tob(N, b);
     cout<< x < 0 ? x + (b * -1) : x;
     return;
}
int main()
{
    int N,b;
    cout<<"Enter the value of n"<<endl;
    cin>>N;
    cout<<"Enter the base to which you want to convert"<<endl;
    cin>>b;
    cout<<"The number in base "<<b<<" is ";
    if (N != 0)
    {
        convert10tob(N, b);
        cout<<endl;
    }
    
    return 0;
}