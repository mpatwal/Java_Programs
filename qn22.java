// Abstract base class Shape
abstract class Shape {
    // Data member to store the dimension(s)
    double dimensions;

    // Constructor to initialize the dimension
    public Shape(double dimensions) {
        this.dimensions = dimensions;
    }

    // Abstract methods for calculating area and perimeter
    public abstract double cal_area();
    public abstract double cal_perimeter();
}

// Derived class for Square
class Square extends Shape {

    // Constructor to initialize the side of the square
    public Square(double side) {
        super(side); // Call to base class constructor to initialize dimensions
    }

    // Implement cal_area() for square
    @Override
    public double cal_area() {
        return dimensions * dimensions; // Area = side^2
    }

    // Implement cal_perimeter() for square
    @Override
    public double cal_perimeter() {
        return 4 * dimensions; // Perimeter = 4 * side
    }
}

// Derived class for Circle
class Circle extends Shape {

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        super(radius); // Call to base class constructor to initialize dimensions
    }

    // Implement cal_area() for circle
    @Override
    public double cal_area() {
        return Math.PI * dimensions * dimensions; // Area = π * radius^2
    }

    // Implement cal_perimeter() for circle (Circumference)
    @Override
    public double cal_perimeter() {
        return 2 * Math.PI * dimensions; // Perimeter (Circumference) = 2 * π * radius
    }
}

public class qn22 {
    public static void main(String[] args) {
        // Create a Square object with side 5
        Shape square = new Square(5);
        System.out.println("Square Area: " + square.cal_area());
        System.out.println("Square Perimeter: " + square.cal_perimeter());

        // Create a Circle object with radius 7
        Shape circle = new Circle(7);
        System.out.println("Circle Area: " + circle.cal_area());
        System.out.println("Circle Perimeter: " + circle.cal_perimeter());
    }
}
