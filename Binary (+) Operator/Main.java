#include<iostream>
//Standard namespace declaration
using namespace std;

class overloading {
    int value;
public:

    void setValue(int temp) {
        value = temp;
    }

    overloading operator+(overloading ob) {
        overloading t;
        t.value = value + ob.value;
        return (t);
    }

    void display() {
        cout << value << endl;
    }
};

//Main Functions

int main() {
    overloading obj1, obj2, result;
    int a, b;

    cin >> a>>b;
    obj1.setValue(a);
    obj2.setValue(b);

    result = obj1 + obj2;
cout<<"Number is: ";
    result.display();
    return 0;
}