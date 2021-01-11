#include<bits/stdc++.h> 
using namespace std; 
int recSearch(int arr[], int l, int r, int x)               
{ 
    if (r < l) 
        return -1; 
    if (arr[l] == x) 
        return l; 
    if (arr[r] == x) 
        return r; 
    return recSearch(arr, l + 1, r - 1, x); 
} 
int main() 
{ 
    int arr[20],n1,x,i;
    cin>>n1;
    for(i=0;i<n1;i++)
    cin>>arr[i];
    cin>>x;
    int index = recSearch(arr, 0, n1 - 1, x); 
    if (index !=-1) 
    cout <<x;     
    else
        cout << "The number is not present in the list"; 
    return 0; 
}
