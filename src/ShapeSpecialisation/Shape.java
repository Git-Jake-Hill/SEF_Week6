package ShapeSpecialisation;

import java.util.List;

class Graphics {
    private List<Integer> x;
    private List<Integer> y;
    private Shape shape;

    public Graphics(Shape shape) {
        this.shape = shape;
    }

    public void addCoordX(Integer x1) {
        x.add(x1);
    }

    public void addCoordY(Integer y1) {
        y.add(y1);
    }
}

abstract class Shape {
    private Graphics g;

    public void draw() {
        // Draw shape

    };

    public double getArea() {
        double area = g.x * g.y;
        return area;
    };

    public double getBoundingArea() {
        double area = g.x * g.y;
        return area;
    };

}

class Square extends Shape {
    public void draw() {
        // draw square
    };

    public double getArea() {
        double area = x * y;
        return area;
    };

    public double getBoundingArea() {
        return 0.0;
    };

    public boolean checkEqualSides() {
        return true;
    }
}

class Circle extends Shape {
    private double radious;

    public void draw() {
        // draw square
    };

    public double getArea() {
        return radious * 3.14;
    };

    public double getBoundingArea() {
        return 0.0;
    };

    public double getRadious() {
        return 0.0;
    }

    public double getPreimeter() {
        return 0.0;
    }
}