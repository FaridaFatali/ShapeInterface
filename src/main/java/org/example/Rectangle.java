package org.example;

public class Rectangle extends Shape {
    double shortSide;
    double longSide;

    public Rectangle(double shortSide, double longSide) {
        super("Rectangle", 4);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the rectangle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the rectangle.");
    }

    @Override
    public double calculateArea() {
        return shortSide * longSide;
    }

    @Override
    public double calculateCircumference() {
        return shortSide + longSide;
    }
}
