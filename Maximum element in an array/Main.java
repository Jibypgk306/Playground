#include<iostream>
#define MAX 100
using namespace std;

  int getMaxElement(int []); 
int size;
int main()
{
    int arr[MAX], max, i;
    cout<<"Enter the size of the array\n";
    cin>>size;
    cout<<"Enter "<<size<<" elements of an array\n";
    for(i = 0; i < size; i++)
    {
        cin>>arr[i];
    }
    max = getMaxElement(arr);  
    cout<<"Maximum element in the array is "<<max;
 
    return 0;
}

int getMaxElement(int a[])
{
    static int i = 0, max = -9999;  
    if(i < size)   
    {
        if(max < a[i])
        max = a[i];
        i++; 
        getMaxElement(a);
    }
    return max;
}
