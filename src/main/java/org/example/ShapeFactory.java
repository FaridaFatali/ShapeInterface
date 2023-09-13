package org.example;

public class ShapeFactory {
    public static void produceShape() {
        Shape shape;
        int i = (int) (3 + Math.random() * 4);

        switch (i) {
            case 3 -> {
                shape = new Circle(3 * i);
                shape.draw();
                System.out.println("\nName: " + '"' + shape.getName() + '"' + "\nNumber of sides: " + shape.getNumberOfSides());
                System.out.println("Area: " + shape.calculateArea() + "\nCircumference: " + shape.calculateCircumference());
                System.out.println();
                shape.erase();
            }
            case 4 -> {
                shape = new Rectangle(3 * i, 5 * i);
                shape.draw();
                System.out.println("\nName: " + '"' + shape.getName() + '"' + "\nNumber of sides: " + shape.getNumberOfSides());
                System.out.println("Area: " + shape.calculateArea() + "\nCircumference: " + shape.calculateCircumference());
                System.out.println();
                shape.erase();
            }
            case 5 -> {
                shape = new Square(4 * i);
                shape.draw();
                System.out.println("\nName: " + '"' + shape.getName() + '"' + "\nNumber of sides: " + shape.getNumberOfSides());
                System.out.println("Area: " + shape.calculateArea() + "\nCircumference: " + shape.calculateCircumference());
                System.out.println();
                shape.erase();
            }
            case 6 -> {
                shape = new Triangle(2 * i, 4 * i);
                shape.draw();
                System.out.println("\nName: " + '"' + shape.getName() + '"' + "\nNumber of sides: " + shape.getNumberOfSides());
                System.out.println("Area: " + shape.calculateArea() + "\nCircumference: " + shape.calculateCircumference());
                System.out.println();
                shape.erase();
            }
        }
    }
}
