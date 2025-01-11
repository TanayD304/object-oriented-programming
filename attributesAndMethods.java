class bankAccount {
    private String accountNumber;
    private double balance;

    bankAccount() {
        accountNumber = "";
        balance = 0;
    }

    bankAccount(String newAccountNumber, double newBalance) {
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    public void setAccountNumber(String newAccountNumber) {
        accountNumber = newAccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double addBalance) {
        if (addBalance < 0) {
            System.out.println("Negative money can not be added : " + addBalance);
        } else {
            balance += addBalance;
        }
    }

    public void withdraw(double withdrawBalance) {
        if (withdrawBalance > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= withdrawBalance;
        }
    }

    public void displayDetails() {
        System.out.println("Acoount Number : " + accountNumber);
        System.out.println("Balance : %.2f" + balance);
        System.out.println();
    }

}
class attributesAndMethods {
    public static void main(String[] args) {
        bankAccount acc1 = new bankAccount("1234", 1234);
        acc1.displayDetails();
        acc1.deposit(4567);
        acc1.displayDetails();
        acc1.deposit(-1);
        acc1.displayDetails();
        acc1.withdraw(1223);
        acc1.displayDetails();
        acc1.withdraw(1000000);
        System.out.println(acc1.getAccountNumber());
        acc1.setAccountNumber("4567");
        System.out.println(acc1.getAccountNumber());
        System.out.println(acc1.getBalance());
    }
}