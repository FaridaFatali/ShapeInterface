package org.example;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the circle.");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle.");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
