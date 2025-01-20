
class Rectangle {

    private double length;
    private double width;
    private double area;

    public Rectangle() {
        length = 1.00;
        width = 1.00;
        area = calculateArea();
        System.out.println("Default");
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = calculateArea();
        System.out.println("Parameterized");
    }

    public Rectangle(Rectangle recSample) {
        this(recSample.length, recSample.width);
        System.out.println("Copy");
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public void displayDetails() {
        System.out.printf("Length : %.2f\n", length);
        System.out.printf("Width : %.2f\n", width);
        System.out.printf("Area : %.2f\n", area);
    }

}

class copyConstructor {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.displayDetails();
        Rectangle r2 = new Rectangle(5.0, 3.0);
        r2.displayDetails();

        Rectangle r3 = new Rectangle(r2);
        r3.displayDetails();
        Rectangle r4 = new Rectangle(r1);
        r4.displayDetails();
    }
}
