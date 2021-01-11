#include<iostream>
using namespace std;
class Arith
{
    private:
        int x,y;
    public:
        int add();
        int sub();
        int mul();
        int div();
};
int Arith::add()
{
    cin>>x;
    cin>>y;
    return(x+y);
}
int Arith::sub()
{
    cin>>x;
    cin>>y;
    return(x-y);
}
int Arith::mul()
{
    cin>>x;
    cin>>y;
    return(x*y);
}
int Arith::div()
{
    cin>>x;
    cin>>y;
    return(x/y);
}
int main()
{
    Arith obj;
                int a=obj.add();
                cout<<a<<endl;
                
                int s=obj.sub();
                cout<<s<<endl;
        
                int m=obj.mul();
                cout<<m<<endl;
        
                int d=obj.div();
                cout<<d<<endl;
               
    } 