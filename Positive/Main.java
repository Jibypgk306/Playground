#include<iostream>
using namespace std;
int main()
{
    int a;
    cin >> a;
    try
    {
        if (a<0)
        {
       
        cout << "Exception Caught as "<<a;
        }
       
    }
    catch (int e)
    {
        cout << "Exception Caught as "<<a;
    }
    
    return 0;
}