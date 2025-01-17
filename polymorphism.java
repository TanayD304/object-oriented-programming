import java.util.*;
class ShapeCalculator{
    public void area(int l, int b) {
        int result = l*b;
        System.out.println("Area of Rectangle : " + result);
    }

    public void area(int b1, int b2, double h) {
        double result =((b1 + b2) * h) / 2;
        System.out.println("Area of Trapezoid : " + (int)result);
    }

    public void area(int r) {
        double result = 3.14*r*r;
        System.out.println("Area of Circle : " + (int)result);
    }
}
class polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int base1 = scanner.nextInt();
        int base2 = scanner.nextInt();
        double height = scanner.nextDouble();

        ShapeCalculator sc = new ShapeCalculator();
        sc.area(radius);
        sc.area(length, width);
        sc.area(base1, base2, height);
    }
}