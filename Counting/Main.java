#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[200];
    int v = 0, c = 0, n = 0, s = 0,sp=0;
    gets(str);
    for (int i = 0; str[i]!='\0'; ++i)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
            ++v;
        else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
                ++c;
             else if (str[i] >= '0' && str[i] <= '9')
                      ++n;
      else if(str[i]==' ')
        ++sp;
                  else
                      ++s;
    }
    cout << "Vowels:" << v;
    cout << "\nConsonants:" << c;
   cout << "\nWhite Spaces:" << sp;
    cout << "\nDigits:" << n;
    cout << "\nSymbols:" << s;
    return 0;
}
