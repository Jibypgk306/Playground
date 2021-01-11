 #include<iostream>
using namespace std;
  //Type your code here...
  class Student
  {
    public:
    
    string name;
    int roll,marks;
    float per;
    void set(string x,int y,int z)
    {
      cin>>x>>y>>z;
      name=x;
      roll=y;
      marks=z;
      per = float(marks) /500*100;
      
    }
  };
  class Mark:public Student
  {
    public:
     
    void display()
    {
    
    cout<<"Enter name:"<<endl;
    cout<<"Enter roll number:"<<endl;
    cout<<"Enter total marks outof 500:"<<endl;
    cout<<"Student details:"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Roll Number: "<<roll<<endl;
    cout<<"Total: "<<marks<<endl;
    cout<<"Percentage: "<<per<<endl;
    }
  };
  int main()
  {
    Mark m;
    string x;
    int y,z;
    
    m.set(x,y,z);
    m.display();
  }