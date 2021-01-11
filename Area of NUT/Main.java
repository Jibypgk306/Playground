#include <iostream>
using namespace std;

class Polygon {
  protected:
    int width, height;
  public:
    void set_values (int a, int b)
      { width=a; height=b; }
};

class Rectangle: public Polygon {
  public:
    int area()
      { return width*height; }
};

class Triangle: public Polygon {
  public:
    int area()
      { return width*height/2; }
};

int main () {
  int a,b;
  Rectangle rect;
  Triangle trgl;
  cin>>a>>b;
  Polygon * ppoly1 = &rect;
  Polygon * ppoly2 = &trgl;
  ppoly1->set_values (a,b);
  ppoly2->set_values (a,b);
  cout << rect.area() << '\n';
  cout << trgl.area() << '\n';
  return 0;
}