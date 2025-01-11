#include<bits/stdc++.h>

using namespace std;

class bankAccount{
    private:
        string accountNumber;
        double balance;

    public:
    bankAccount() {
        accountNumber = "";
        balance = 0;
    }

    bankAccount(string newAccountNumber, double newBalance) {
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    void setAccountNumber(string newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    string getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double addBalance) {
        if(addBalance<0) {
            cout<<"Negative money can not be added : "<<addBalance<<endl;
        } else {
            balance+=addBalance;
        }
    }

    void withdraw(double withdrawBalance) {
        if(withdrawBalance>balance) {
            cout<<"Insufficient funds!"<<endl;
        } else {
            balance-=withdrawBalance;
        }
    }

    void displayDetails() {
        cout<<"Account Number : "<<accountNumber<<endl;
        cout<<"Balance : "<<balance<<endl;
        cout<<endl;
    }
};

int main() {
    bankAccount* acc1 = new bankAccount("1234", 1234);
    acc1->displayDetails();
    acc1->deposit(4567);
    acc1->displayDetails();
    acc1->deposit(-1);
    acc1->displayDetails();
    acc1->withdraw(1223);
    acc1->displayDetails();
    acc1->withdraw(1000000);
    cout<<acc1->getAccountNumber()<<endl;
    acc1->setAccountNumber("4567");
    cout<<acc1->getAccountNumber()<<endl;
    cout<<acc1->getBalance()<<endl;
    return 0;
}