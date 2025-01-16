class Rectangle {
    private double length;
    private double width;
    private double area;

    public Rectangle() {
        length = 1.00;
        width = 1.00;
        area = calculateArea();
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = calculateArea();
    }

    public double calculateArea() {
        return this.length*this.width;
    }

    public void displayDetails() {
        System.out.printf("Length : %.2f\n", length);
        System.out.printf("Width : %.2f\n", width);
        System.out.printf("Area : %.2f\n", area);
    }

}
class constructors {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.displayDetails();
        Rectangle r2 = new Rectangle(5.0, 3.0);
        r2.displayDetails();
    }
}