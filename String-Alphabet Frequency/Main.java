#include <iostream>
using namespace std;

int main()
{
    char str[100];
    int i;

    int freq[200]={0};
    cin >> str;

    for(i = 0; str[i] != '\0'; i++)
    {
        freq[str[i]]++;
    }

    for(i = 0; i <200; i++)
    {
        if(freq[i] != 0)
        {
            cout <<(char)i << " "<< freq[i] << endl;
        }
    }

    return 0;
}