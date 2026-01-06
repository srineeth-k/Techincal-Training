// Interface
interface Shapes {
    double area();

    double perimeter();
}

// Abstract class
abstract class ShapeDetails implements Shapes {
    // No extra methods (used for abstraction & future extension)
}

// Rectangle class
class Rectangle extends ShapeDetails {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Square class
class Square extends ShapeDetails {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

// Circle class
class Circle extends ShapeDetails {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class
class Triangle extends ShapeDetails {
    double a, b, c, base, height;

    Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        return a + b + c;
    }
}

// Main class
public class ShapesDemo {
    public static void main(String[] args) {

        Shapes r = new Rectangle(10, 5);
        Shapes s = new Square(4);
        Shapes c = new Circle(3);
        Shapes t = new Triangle(3, 4, 5, 4, 3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());

        System.out.println("Square Area: " + s.area());
        System.out.println("Square Perimeter: " + s.perimeter());

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
    }
}
