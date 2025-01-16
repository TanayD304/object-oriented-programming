import java.util.Scanner;
class Employee {

    public String name;
    protected int employeeId;
    private double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary < 0) {
            System.out.println("Invalid salary");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid salary");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + name);
        System.out.println("Employee Id : " + employeeId);
        System.out.printf("Salary : %.2f\n", salary);
    }
}

class accessModifiers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int employeeId = sc.nextInt();
        double salary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
