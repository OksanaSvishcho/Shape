public abstract class Shape {
    public abstract String shapeName();
}
class Circle extends Shape {
    @Override
    public String shapeName() {
        return "Circle";
    }
}
class Quad extends Shape {
    @Override
    public String shapeName() {
        return "Quad";
    }
}
class Triangle extends Shape {
    @Override
    public String shapeName() {
        return "Triangle";
    }
}
class Rectangle extends Shape {
    @Override
    public String shapeName() {
        return "Rectangle";
    }
}
class Ellipse extends Shape {
    @Override
    public String shapeName() {
        return "Ellipse";
    }
}
class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println(shape.shapeName());
    }
}


class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse();

        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);    // Output: Circle
        shapePrinter.printShapeName(quad);      // Output: Quad
        shapePrinter.printShapeName(triangle);  // Output: Triangle
        shapePrinter.printShapeName(rectangle);  // Output: Pentagon
        shapePrinter.printShapeName(ellipse);   // Output: Hexagon
    }
}