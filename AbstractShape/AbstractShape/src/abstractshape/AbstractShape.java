package abstractshape;

abstract class Shape {
    int d1 = 10;
    int d2 = 5;
    abstract void printArea();
}

class Rectangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Rectangle:\t" + (d1 * d2));
    }
}

class Triangle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Triangle:\t" + (0.5 * d1 * d2));
    }
}

class Circle extends Shape {
    @Override
    void printArea() {
        System.out.println("Area of Circle:\t\t" + (3.14 * d1));
    }
}

public class AbstractShape {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        r.printArea();
        t.printArea();
        c.printArea();
    }
}