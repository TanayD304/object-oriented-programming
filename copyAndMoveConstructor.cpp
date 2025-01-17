#include <bits/stdc++.h>

using namespace std;

class Rectangle
{
private:
    double length;
    double width;
    double area;

public:
    Rectangle()
    {
        length = 1.0;
        width = 1.0;
        area = calculateArea();
    }

    Rectangle(double length, double width)
    {
        this->length = length;
        this->width = width;
        area = calculateArea();
    }

    // Rectangle(const Rectangle &recSample) {
    //     this->length = recSample.length;
    //     this->width = recSample.width;
    //     this->area = recSample.area;
    // }

    void change() {
        length = 2.00;
        width = 2.00;
        area = calculateArea();
    }

    double calculateArea()
    {
        return this->length * this->width;
    }

    void displayDetails()
    {
        cout << "Length : " << length << endl;
        cout << "Width : " << width << endl;
        cout << "Area : " << calculateArea() << endl;
    }
    void displayDetailsReference()
    {
        cout << "Length : " << &length << endl;
        cout << "Width : " << &width << endl;
        cout << "Area : " << &area << endl;
    }
};

int main()
{
    Rectangle *r1 = new Rectangle();
    r1->displayDetails();
    r1->displayDetailsReference();
    Rectangle *r2 = new Rectangle(5.0, 3.0);
    r2->displayDetails();
    Rectangle r3 = *r1;
    r3.displayDetails();
    r3.displayDetailsReference();
    r3.change();
    r3.displayDetails();
    r1->displayDetails();

    return 0;
}