#include<iostream>
using namespace std;
 
class NUM
{
    private:
        int n;
         
    public:
        //function to get number
        void getNum(int x)
        {
            n=x;
        }
        //function to display number
        void dispNum(void)
        {
            cout << "value of n is: " << n;
        }
        //unary - operator overloading
        void operator - (void)
        {
            n=-n;
        }
};

int main()
{
  int x;
  cin>>x;
    NUM num;
    num.getNum(x);
    -num;
    num.dispNum();
    cout << endl;
    return 0;
     
}