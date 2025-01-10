#include<bits/stdc++.h>

using namespace std;

class Student {
    private:
        string name;
        int rollNumber;

    public:
        void setDetails(string newName, int newRollNumber) {
            name = newName;
            rollNumber = newRollNumber;
        }

        void displayDetails() {
            cout<<"Name : "<<name<<endl;
            cout<<"Roll Number : "<<rollNumber<<endl;
        }
};

int main() {
    string newName;
    int newRollNumber;
    cin>>newName>>newRollNumber;

    Student* st1 = new Student(); // object pointer;
    st1->setDetails(newName, newRollNumber);
    st1->displayDetails();

    Student st2; // object
    cin>>newName>>newRollNumber;
    st2.setDetails(newName, newRollNumber);
    st2.displayDetails();
    return 0;
}