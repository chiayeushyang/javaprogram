import java.util.function.DoubleUnaryOperator;

public abstract class Shape {

    public abstract double getArea();
    public abstract double getPerimeter();

    public static void main(String[] args) {
        Square square1 = new Square(7,7);
        Rectangle rect1 = new Rectangle(7,9);

        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
    }
}

class Square extends Shape {
    private double width;
    private double height;

    Square (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    };
    public double getPerimeter() {
        return 2*width + 2*height;
    };
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    };
    public double getPerimeter() {
        return 2*width + 2*height;
    };
}