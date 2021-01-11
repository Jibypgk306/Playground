#include<iostream>
using namespace std;
int main()
{
    int m, d;
    float r, total;
    cin>>m;
    cin>>r;
    cin>>d;
    switch(m)
    {
        case 1:
        case 2:
        case 3:
        total = r*d;
        cout<<total;
        break;
        case 4:
        case 5:
        case 6:
        total = r*d;
        total+=0.2*total;
        cout<<total;
        break;
        case 7:
        case 8:
        case 9:
        case 10:
        total = r*d;
        cout<<total;
        break;
        case 11:
        case 12:
        total = r*d;
        total+=0.2*total;
        cout<<total;
        break;
        default:
        cout<<"Invalid Input";
    }
    return 0;

}
