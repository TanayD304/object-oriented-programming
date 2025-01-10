import java.util.*;

class Student {
    private String name;
    private int rollNumber;

    public void setDetails(String newName, int newRollNumber) {
        name = newName;
        rollNumber = newRollNumber;
    }

    public void displayDetails() {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNumber);
    }
}
class classesAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int rollNumber = scanner.nextInt();

        Student st1 = new Student();
        st1.setDetails(name, rollNumber);
        st1.displayDetails();

        name = scanner.next();
        rollNumber = scanner.nextInt();

        Student st2 = new Student();
        st2.setDetails(name, rollNumber);
        st2.displayDetails();
    }
}