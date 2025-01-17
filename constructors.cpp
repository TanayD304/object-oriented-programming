#include<bits/stdc++.h>

using namespace std;

class Rectangle {
    private:
        double length;
        double width;
        double area;
    public:
        Rectangle() {
            length = 1.0;
            width = 1.0;
            area = calculateArea();
        }

        Rectangle(double length, double width) {
            this->length = length;
            this->width = width;
            area = calculateArea();
        }

        double calculateArea() {
            return this->length*this->width;
        }

        void displayDetails() {
            cout<<"Length : "<<length<<endl;
            cout<<"Width : "<<width<<endl;
            cout<<"Area : "<<calculateArea()<<endl;
        }
};

int main() {
    Rectangle *r1 = new Rectangle();
    r1->displayDetails();
    Rectangle *r2 = new Rectangle(5.0, 3.0);
    r2->displayDetails();
    return 0;
}